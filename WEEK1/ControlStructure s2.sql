BEGIN 
  FOR cust in (SELECT customer_id, balance FROM customer_details)
  LOOP
    IF cust.balance>10000 THEN
      UPDATE customer_details
      SET isVIP='TRUE'
      where customer_id=cust.customer_id;
    END IF;
  END LOOP;
END;
/