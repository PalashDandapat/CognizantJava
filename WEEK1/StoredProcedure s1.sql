CREATE OR REPLACE PROCEDURE ProccessMonthlyInterest
IS
BEGIN
  UPDATE customerdetails 
  SET savingaccountbalance=savingaccountbalance+(0.01*savingaccountbalance);

END
