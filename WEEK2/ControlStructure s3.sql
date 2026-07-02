SET SERVEROUTPUT ON;
DECLARE
C_NAME customer_details.customer_name%TYPE;
BEGIN 
  FOR cust in (SELECT customer_id FROM loan_details WHERE loan_date>SYSDATE+30)
  LOOP
    SELECT customer_name INTO C_NAME FROM customer_details WHERE customer_details.customer_id=cust.customer_id;
    DBMS_OUTPUT.PUT_LINE('Pending due FOR ' || C_NAME);
    
  END LOOP;
END;
/