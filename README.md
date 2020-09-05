# ConnectionMySQL

Connection

public interface Connection
extends Wrapper, AutoCloseable

A connection (session) with a specific database. SQL statements are executed and 
results are returned within the context of a connection.

A Connection object's database is able to provide information describing its tables, 
its supported SQL grammar, its stored procedures, the capabilities of this connection, 
and so on. This information is obtained with the getMetaData method.

First, you need to establish a connection with the data source you want to use. 
A data source can be a DBMS, a legacy file system, or some other source of data with 
a corresponding JDBC driver. Typically, a JDBC application connects to a target data 
source using one of two classes.

Screenshots: 

![Image](https://github.com/BrunoBeltreGuzman/ConnectionMySQL/blob/master/Screenshot.png)
