/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture donald = new Picture("donald.jpg");
      donald.mirrorVerticalRightToLeft();
      donald.explore();
  }
    
  public static void testMirrorHorizontal()
  {
      Picture donald = new Picture("donald.jpg");
      donald.mirrorHorizontal();
      donald.explore();
  }
  
  public static void testMirrorHorizontalOtherWay()
  {
      Picture donald = new Picture("donald.jpg");
      donald.mirrorHorizontalOtherWay();
      donald.explore();
  }
  
  public static void testMirrorDiagonal()
  {
      Picture donald = new Picture("donald.jpg");
      donald.mirrorDiagonal();
      donald.explore();
  }
  
  public static void testMirrorArms()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.mirrorArms();
      snowman.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture pix = new Picture("donald.jpg");
      pix.keepOnlyBlue();
      pix.explore();
  }
  
  public static void testNegate()
  {
      Picture pix = new Picture("donald.jpg");
      pix.negate();
      pix.explore();
  }
  
  public static void testGrayscale()
  {
      Picture pix = new Picture("donald3.jpg");
      pix.grayscale();
      pix.explore();
  }
  
  public static void testCropAndCopy()
  {
      Picture pix1 = new Picture("snowman.jpg");
      Picture pix2 = new Picture("arch.jpg");
      pix2.cropAndCopy(pix1,30,100,40,200,10,20);
      pix2.explore();
  }
  
  public static void testHalfSize()
  {
      Picture pix = new Picture("donald3.jpg");
      pix.explore();
      pix.halfSize();
      pix.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    // testFixUnderwater();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalOtherWay();
    testMirrorDiagonal();
    testMirrorArms();
    testNegate();
    testKeepOnlyBlue();
    testGrayscale();
    testCropAndCopy();
    //testMirrorTemple();
    //testMirrorGull();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}