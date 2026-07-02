CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  dept IN varchar2,percent IN NUMBER)
IS
BEGIN
  UPDATE BalanceSheet 
  SET salary=salary+(0.01*percent*salary)
  WHERE Department=dept;

END;
