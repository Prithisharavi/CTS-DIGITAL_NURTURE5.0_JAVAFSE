CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_id IN NUMBER,
    p_name IN VARCHAR2,
    p_dob IN DATE,
    p_balance IN NUMBER
)
AS
BEGIN

    INSERT INTO Customers
    VALUES(
        p_id,
        p_name,
        p_dob,
        p_balance,
        SYSDATE
    );

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
    'Customer Added Successfully');

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE(
        'Error: Customer ID already exists');
END;
/

BEGIN
   AddNewCustomer(
      3,
      'David Miller',
      TO_DATE('1995-01-01','YYYY-MM-DD'),
      2500
   );
END;
/