/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgGroup extends MgComposite {
  private long swigCPtr;

  protected MgGroup(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgGroup_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MgGroup() {
    this(touchvgJNI.new_MgGroup(), true);
  }

  public static MgGroup create() {
    long cPtr = touchvgJNI.MgGroup_create();
    return (cPtr == 0) ? null : new MgGroup(cPtr, false);
  }

  public static int Type() {
    return touchvgJNI.MgGroup_Type();
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgGroup_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgGroup_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgGroup_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgGroup_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgGroup_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgGroup_isKindOf(swigCPtr, this, type);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgGroup_getExtent(swigCPtr, this), true);
  }

  public void update() {
    touchvgJNI.MgGroup_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgGroup_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    touchvgJNI.MgGroup_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgGroup_clearCachedData(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgGroup_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgGroup_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgGroup_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return touchvgJNI.MgGroup_isClosed(swigCPtr, this);
  }

  public boolean hitTestBox(Box2d rect) {
    return touchvgJNI.MgGroup_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgGroup_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(MgPath path) {
    touchvgJNI.MgGroup_output(swigCPtr, this, MgPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return touchvgJNI.MgGroup_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return touchvgJNI.MgGroup_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return touchvgJNI.MgGroup_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(touchvgJNI.MgGroup_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return touchvgJNI.MgGroup_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return touchvgJNI.MgGroup_isHandleFixed(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return touchvgJNI.MgGroup_getHandleType(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return touchvgJNI.MgGroup_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgGroup_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

  public boolean addShapeToGroup(MgShape shape) {
    return touchvgJNI.MgGroup_addShapeToGroup(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public Point2d getInsertionPoint() {
    return new Point2d(touchvgJNI.MgGroup_getInsertionPoint(swigCPtr, this), true);
  }

  public void setInsertionPoint(Point2d pt) {
    touchvgJNI.MgGroup_setInsertionPoint(swigCPtr, this, Point2d.getCPtr(pt), pt);
  }

  public boolean hasInsertionPoint() {
    return touchvgJNI.MgGroup_hasInsertionPoint(swigCPtr, this);
  }

  public Point2d getCenterPoint() {
    return new Point2d(touchvgJNI.MgGroup_getCenterPoint(swigCPtr, this), true);
  }

}
