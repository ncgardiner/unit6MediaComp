
public class MakeCollage
{
    public static void main(String[]args)
    {
        //pic is 799x1199
        Picture canvas = new Picture(800,1200);
        //top left
        Picture poster = new Picture("donald3.jpg");
        poster.posterize();
        poster.halfSize();
        canvas.cropAndCopy(poster,0,400,0,600,0,0);
        //top right
        Picture edgy = new Picture("donald3.jpg");
        edgy.edgeDetection(15);
        edgy.halfSize();
        canvas.cropAndCopy(edgy,0,400,0,600,0,598);
        //bottom left
        Picture mirrored = new Picture("donald3.jpg");
        mirrored.mirrorHorizontal();
        mirrored.mirrorVertical();
        mirrored.halfSize();
        canvas.cropAndCopy(mirrored,0,400,0,600,398,0);
        //bottom right
        Picture negate = new Picture("donald3.jpg");
        negate.negate();
        negate.halfSize();
        canvas.cropAndCopy(negate,0,400,0,600,398,598);
        //middle
        Picture original = new Picture("donald3.jpg");
        original.halfSize();
        original.halfSize();
        canvas.cropAndCopy(original,0,200,0,300,300,450);
        //explore
        canvas.explore();
        canvas.write("myCollage.jpg");
    }
}