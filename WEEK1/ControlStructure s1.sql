CREATE OR REPLACE PROCEDURE SeniorBenifit
is
BEGIN 
  FOR Customer IN (SELECT cust_id, age FROM Customer_Details)
  LOOP
    IF Customer.age>60 THEN
      UPDATE Loan
      SET interest=interest-1
      WHERE custId=Customer.cust_id;
    END IF;

  END LOOP;
END;
/