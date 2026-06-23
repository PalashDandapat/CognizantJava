set serveroutput on
CREATE OR REPLACE PROCEDURE TransferFunds(
  from_account IN NUMBER,to_account IN NUMBER, amt IN NUMBER)
  

IS
acc account_details%ROWTYPE;
BEGIN
  SELECT * INTO acc FROM account_details where account_number=from_account;
  if acc.balance>=amt
  then
    UPDATE account_details
    set balance=balance-amt
    where account_number=from_account;
    UPDATE account_details
    set balance=balance+amt
    where account_number=to_account;
  else
    DBMS_output.put_line('NOT SUFFICIENT BALANCE');
  end if;


END;
