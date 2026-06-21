SET SERVEROUTPUT ON;

BEGIN
   FOR cust IN (
      SELECT CustomerID, CustomerName, Age
      FROM Customers
   ) LOOP

      IF cust.Age > 60 THEN
         UPDATE Loans
         SET InterestRate = InterestRate - 1
         WHERE CustomerID = cust.CustomerID;

         DBMS_OUTPUT.PUT_LINE(
            'Discount applied for customer: ' || cust.CustomerName
         );
      END IF;

   END LOOP;

   COMMIT;
END;
/