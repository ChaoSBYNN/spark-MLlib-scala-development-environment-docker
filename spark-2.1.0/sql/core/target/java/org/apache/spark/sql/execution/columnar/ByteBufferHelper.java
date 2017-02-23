package org.apache.spark.sql.execution.columnar;
/**
 * A help class for fast reading Int/Long/Float/Double from ByteBuffer in native order.
 * <p>
 * Note: There is not much difference between ByteBuffer.getByte/getShort and
 * Unsafe.getByte/getShort, so we do not have helper methods for them.
 * <p>
 * The unrolling (building columnar cache) is already slow, putLong/putDouble will not help much,
 * so we do not have helper methods for them.
 * <p>
 * WARNING: This only works with HeapByteBuffer
 */
public  class ByteBufferHelper {
  static public  int getInt (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  static public  long getLong (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  static public  float getFloat (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  static public  double getDouble (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
}