import sqlite3


conn = sqlite3.connect("users.sqlite");

c = conn.cursor()

def create_table():
	c.execute('CREATE TABLE IF NOT EXISTS users(id REAL, username TEXT, password TEXT)')


def data_entry():
	c.execute("DELETE FROM users")
	c.execute("INSERT INTO users VALUES(1, 'admin', 'youwillneverguessthispassword')")
	c.execute("INSERT INTO users VALUES(1, 'lindy', 'passw0rd')")

	conn.commit()
	c.close()
	conn.close()


create_table()
data_entry()
