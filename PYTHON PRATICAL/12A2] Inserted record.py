import mysql.connector
db=mysql.connector.connect(user='root',passwd='root',host='127.0.0.1',database
='python_mysql')
cursor = db.cursor()
# Prepare SQL query to INSERT a record into the database.
sql = """INSERT INTO EMPLOYEE(FIRST_NAME,
LAST_NAME, AGE, SEX, INCOME)
VALUES ('Nitesh', 'Shukla', 23, 'M', 20000)"""
try:
# Execute the SQL command
 cursor.execute(sql)
 print ("Data Inserted Successfully...!")
# Commit your changes in the database
 db.commit()
except:
# Rollback in case there is any error
 db.rollback()
# disconnect from server
db.close()
