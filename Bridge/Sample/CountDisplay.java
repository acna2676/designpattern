public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) { // times�󷫤��֤���ɽ������
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}

// FIXME:aiueo
// TODO:aaaaa
// NOTE:ssss
// WARNING:...
// CHANGED:,,,

//change on develop branch

//change on develop branch 2
