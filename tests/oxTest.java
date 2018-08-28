import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class oxTest {

        @Test
        public void shouldCreateOXObjectCorrectly() {

            ox OX = new ox();
            assertEquals(" 012\n0---\n1---\n2---\n", OX.gettableString());
            assertEquals("X", OX.getCurrentplayer());
            assertEquals(0, OX.getcountX());
            assertEquals(0, OX.getcountO());
            assertEquals(0, OX.getcountDreaw());
        }

        @Test
        public void put() {
            ox OX = new ox();
            OX.put(1, 1);
            assertEquals(" 012\n0---\n1-X-\n2---\n", OX.gettableString());
            OX.put(0, 0);
            assertEquals(" 012\n0X--\n1-X-\n2---\n", OX.gettableString());
            OX.put(2, 1);
            assertEquals(" 012\n0X--\n1-XX\n2---\n", OX.gettableString());
            OX.swithPlayer();
            OX.put(0, 2);
            assertEquals(" 012\n0X--\n1-XX\n2O--\n", OX.gettableString());
            assertEquals(false, OX.put(0, 2));
            assertEquals(false, OX.put(0, 3));
        }

        @Test
        public void swithPlayer() {
            ox OX = new ox();
            OX.swithPlayer();
            assertEquals("O", OX.getCurrentplayer());
            OX.swithPlayer();
            assertEquals("X", OX.getCurrentplayer());
        }

    @Test
        public void CheckWin1(){
            ox OX = new ox();
            OX.put(0, 0);
            OX.put(0, 1);
            OX.put(0, 2);
            assertEquals(" 012\n0X--\n1X--\n2X--\n", OX.gettableString());
            assertEquals(true,OX.checkWin(0,0));
            assertEquals(true,OX.checkWin(0,1));
            assertEquals(true,OX.checkWin(0,2));
        }

    @Test
    public void CheckWin2(){
        ox OX = new ox();
        OX.put(0, 0);
        OX.put(0, 1);
        assertEquals(" 012\n0X--\n1X--\n2---\n", OX.gettableString());
        assertEquals(false,OX.checkWin(0,0));
        assertEquals(false,OX.checkWin(0,1));

    }

    @Test
    public void CheckWin3(){
        ox OX = new ox();
        OX.put(1, 0);
        OX.put(1, 1);
        OX.put(1, 2);
        assertEquals(" 012\n0-X-\n1-X-\n2-X-\n", OX.gettableString());
        assertEquals(true,OX.checkWin(1,0));
        assertEquals(true,OX.checkWin(1,1));
        assertEquals(true,OX.checkWin(1,2));
    }

    @Test
    public void CheckWin4(){
        ox OX = new ox();
        OX.put(0, 0);
        OX.put(1, 0);
        OX.put(2, 0);
        assertEquals(" 012\n0XXX\n1---\n2---\n", OX.gettableString());
        assertEquals(true,OX.checkWin2(0,0));
        assertEquals(true,OX.checkWin2(1,0));
        assertEquals(true,OX.checkWin2(2,0));
    }

    @Test
    public void CheckWin5(){
        ox OX = new ox();
        OX.put(0, 0);
        OX.put(1, 1);
        OX.put(2, 2);
        assertEquals(" 012\n0X--\n1-X-\n2--X\n", OX.gettableString());
        assertEquals(true,OX.checkWin3(0,0));
        assertEquals(true,OX.checkWin3(1,1));
        assertEquals(true,OX.checkWin3(2,2));
    }

    @Test
    public void CheckWin6(){
        ox OX = new ox();
        OX.put(2, 0);
        OX.put(1, 1);
        OX.put(0, 2);
        assertEquals(" 012\n0--X\n1-X-\n2X--\n", OX.gettableString());
        assertEquals(true,OX.checkWin4(2,0));
        assertEquals(true,OX.checkWin4(1,1));
        assertEquals(true,OX.checkWin4(0,2));
    }
    }