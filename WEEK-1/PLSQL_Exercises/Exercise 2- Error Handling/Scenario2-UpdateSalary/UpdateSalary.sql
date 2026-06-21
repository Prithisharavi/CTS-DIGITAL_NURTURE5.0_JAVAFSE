CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_empid IN NUMBER,
    p_percentage IN NUMBER
)
AS
BEGIN

    UPDATE Employees
    SET Salary = Salary +
        (Salary * p_percentage / 100)
    WHERE EmployeeID = p_empid;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(
        -20002,
        'Employee ID does not exist');
    END IF;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
    'Salary updated successfully');

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
        'Error: ' || SQLERRM);
END;
/

BEGIN
   UpdateSalary(2,10);
END;
/