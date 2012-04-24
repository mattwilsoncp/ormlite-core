package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;

/**
 * Type that persists a {@link java.sql.Timestamp} object.
 * 
 * @author graywatson
 */
public class TimeStampType extends DateType {

	private static final TimeStampType singleTon = new TimeStampType();

	public static TimeStampType getSingleton() {
		return singleTon;
	}

	private TimeStampType() {
		super(SqlType.DATE, new Class<?>[] { java.sql.Timestamp.class });
	}

	protected TimeStampType(SqlType sqlType, Class<?>[] classes) {
		super(sqlType, classes);
	}

	@Override
	public Object sqlArgToJava(FieldType fieldType, Object sqlArg, int columnPos) {
		// noop pass-thru
		return sqlArg;
	}

	@Override
	public Object javaToSqlArg(FieldType fieldType, Object javaObject) {
		// noop pass-thru
		return javaObject;
	}
}
