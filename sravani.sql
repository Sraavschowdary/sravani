CREATE TABLE Customers (Cust_Name VARCHAR(30) PRIMARY KEY);
insert into Customers values('john');
insert into Customers values('david');
insert into Customers values('sailesh');
insert into Customers values('pranav');
insert into Customers values('mary');
insert into Customers values('shabir');
create table accounts1(acc_no varchar(5) primary key,acc_type varchar(5),cust_name varchar(10),branch varchar(20),balance number(10),foreign key(cust_name) references  Customers);
insert into accounts1 values('a101','sb','john','bhimavaram',50000);
insert into accounts1 values('a102','ca','david','vijayawada',23450);
insert into accounts1 values('a103','sb','john','bhimavaram',34000);
insert into accounts1 values('a104','sb','sailesh','vizag',70000);
insert into accounts1 values('a105','ca','pranav','bhimavaram',90000);
insert into accounts1 values('a106','sb','mary','vizag',17000);
insert into accounts1 values('a107','ca','david','vijayawada',56000);
insert into accounts1 values('a108','rd','shabir','bhimavaram',28000);
select* from accounts1;
create table loans2(l_no varchar(5) primary key,l_type varchar(5),cust_name varchar(10),branch varchar(20),amount number(10),foreign key(cust_name) references  Customers);

insert into loans2 values('l101','pl','david','bhimavaram',50000);
insert into loans2 values('l102','jl','sailesh','vijayawada',90000);
insert into loans2 values('l103','ml','david','bhimavaram',1500000);
insert into loans2 values('l104','jl','sailesh','vizag',70000);
insert into loans2 values('l105','cl','pranav','bhimavaram',90000);
insert into loans2 values('l106','ml','shabir','vizag',17000);
insert into loans2 values('l107','cl','mary','vijayawada',56000);
insert into loans2 values('l108','pl','shabir','vijayawada',400000);
select* from loans2;

//2) Create a table with Primary Key & NOT NULL constraints
CREATE TABLE Branch (Branch_Id NUMBER PRIMARY KEY,Branch_Name VARCHAR(30) NOT NULL,City VARCHAR(30) NOT NULL);
INSERT INTO Branch VALUES (1, 'Bhimavaram', 'AP');
INSERT INTO Branch VALUES (3, NULL, 'AP');

//3) For accounts belong to John, find account numbers and their types.
SELECT ACC_NO,ACC_TYPE FROM ACCOUNTS1 WHERE CUST_NAME='john';

//4) For each branch, display sum of balances of SB accounts and Current Accounts separately.
select sum(balance) from accounts1 where acc_type='sb' group by acc_type;
select sum(balance) from accounts1 where acc_type='ca' group by acc_type;


//5) Find the customer who had two accounts at the same branch.
SELECT CUST_NAME,BRANCH FROM ACCOUNTS1 GROUP BY cust_name,branch HAVING COUNT(*)>=2;


//6) Find the maximum account balance among SB account
SELECT MAX(Balance) AS Max_SB_Balance FROM Accounts1 WHERE acc_type = 'sb';

//7) Find the names of customers who have both an account and a loan.
SELECT DISTINCT a.CUST_NAME FROM accounts1 a JOIN loans2 l on a.cust_name=l.cust_name;

//8) Find the customers who had two types of accounts.
SELECT Cust_Name FROM accounts1 GROUP BY cust_name HAVING COUNT(DISTINCT acc_type) = 2;


//9) Find the loan type for which the total loan amount is the minimum over all types.
SELECT l_type,sum(amount) FROM loans2 GROUP BY l_type HAVING SUM(amount) = (SELECT MIN(SUM(amount)) FROM loans2 GROUP BY l_type);

//10) Find the branches in which there are more accounts than loans.
SELECT Branch FROM accounts1 GROUP BY Branch HAVING COUNT(*) >(SELECT COUNT(*) FROM loans2 WHERE Loans2.Branch = Accounts1.Branch);


//11) A single withdrawal can’t exceed Rs. 15000/- for SB accounts. Create a trigger.

CREATE OR REPLACE TRIGGER SB_Withdrawal
BEFORE UPDATE ON accounts1
FOR EACH ROW
BEGIN
IF :OLD.Acc_type = 'sb' AND (:OLD.Balance - :NEW.Balance) > 15000 THEN
RAISE_APPLICATION_ERROR(-20001,'Withdrawal exceeds Rs.15000 limit for SB account');
END IF;
END;
/
update accounts1 set balance =balance-1000 where acc_no='a102';
