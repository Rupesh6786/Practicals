import mysql.connector
db=mysql.connector.connect(user='root',passwd='root',host='127.0.0.1',database
='nit')
# prepare a cursor object using cursor() method
cursor = db.cursor()
# Prepare SQL query to UPDATE required records
sql = "DELETE FROM EMPLOYEE WHERE AGE < '%d'" % (20)
try:
# Execute the SQL command
 cursor.execute(sql)
 print ("Data Deleted SuccessFully..!")
# Commit your changes in the database
 db.commit()
except:
# Rollback in case there is any error
 db.rollback()
# disconnect from server
db.close()
