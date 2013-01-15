package org.oregami.test;

public class DBHelper {

	public static org.hsqldb.server.Server startHSQLDb() {
		org.hsqldb.server.Server hsqlServer = new org.hsqldb.server.Server();
		hsqlServer.setSilent(true);
		hsqlServer.setLogWriter(null);
		hsqlServer.setDatabaseName(0, "oregami");
		hsqlServer.setDatabasePath(0, "mem:work/oregamidb");
		hsqlServer.setPort(4000);

		hsqlServer.start();

		return hsqlServer;
	}
	
}
