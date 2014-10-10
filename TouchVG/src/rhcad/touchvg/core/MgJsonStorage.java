/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgJsonStorage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgJsonStorage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgJsonStorage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgJsonStorage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MgJsonStorage() {
    this(touchvgJNI.new_MgJsonStorage(), true);
  }

  public MgStorage storageForRead(String content) {
    long cPtr = touchvgJNI.MgJsonStorage_storageForRead__SWIG_0(swigCPtr, this, content);
    return (cPtr == 0) ? null : new MgStorage(cPtr, false);
  }

  public MgStorage storageForWrite() {
    long cPtr = touchvgJNI.MgJsonStorage_storageForWrite(swigCPtr, this);
    return (cPtr == 0) ? null : new MgStorage(cPtr, false);
  }

  public MgStorage storageForRead(MgJsonFile file) {
    long cPtr = touchvgJNI.MgJsonStorage_storageForRead__SWIG_1(swigCPtr, this, MgJsonFile.getCPtr(file), file);
    return (cPtr == 0) ? null : new MgStorage(cPtr, false);
  }

  public boolean save(MgJsonFile file, boolean pretty) {
    return touchvgJNI.MgJsonStorage_save__SWIG_0(swigCPtr, this, MgJsonFile.getCPtr(file), file, pretty);
  }

  public boolean save(MgJsonFile file) {
    return touchvgJNI.MgJsonStorage_save__SWIG_1(swigCPtr, this, MgJsonFile.getCPtr(file), file);
  }

  public String stringify(boolean pretty) {
    return touchvgJNI.MgJsonStorage_stringify__SWIG_0(swigCPtr, this, pretty);
  }

  public String stringify() {
    return touchvgJNI.MgJsonStorage_stringify__SWIG_1(swigCPtr, this);
  }

  public void clear() {
    touchvgJNI.MgJsonStorage_clear(swigCPtr, this);
  }

  public String getParseError() {
    return touchvgJNI.MgJsonStorage_getParseError(swigCPtr, this);
  }

  public void setArrayMode(boolean arr) {
    touchvgJNI.MgJsonStorage_setArrayMode(swigCPtr, this, arr);
  }

  public void saveNumberAsString(boolean str) {
    touchvgJNI.MgJsonStorage_saveNumberAsString(swigCPtr, this, str);
  }

  public static boolean toUTF8(String infile, String outfile) {
    return touchvgJNI.MgJsonStorage_toUTF8(infile, outfile);
  }

  public static boolean toUTF16(String infile, String outfile) {
    return touchvgJNI.MgJsonStorage_toUTF16(infile, outfile);
  }

}
