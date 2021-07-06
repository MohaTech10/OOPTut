

@interface AlwaysInline {

}

class Color {}
class Font {}

// TODO: 7/6/21 add textBackground;
class Text {

    Color color;
    Font font;
    String text;

    private Alignment alignment;

    public Text() {

    }

    private void alignText() {
        switch (alignment) {
            case left -> {
                System.out.println(text+"     ");
            }
            case right -> {

            }
            case center -> {}
        }
    }
    enum Alignment {
        center, left, right;
    }



    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;

    }
}
public class Table {

    // Selected cell?
    int rows, columns;
    String header;

    Text text;


    boolean canExpand() {

        return (rows * columns) <= maximumCells(); // Boolean expression itself.
    }


    @AlwaysInline
    public int rows() {
        return columns * rows;
    }

    @AlwaysInline
    public int maximumCells() {
        return 90;
    }
}

// what's a table?
