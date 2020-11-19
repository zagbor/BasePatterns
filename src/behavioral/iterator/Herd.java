package behavioral.iterator;


public class Herd implements Collection {
    private String nameHerd;
    private String[] lambs;

    public Herd(String nameLamb, String[] lambs) {
        this.nameHerd = nameLamb;
        this.lambs = lambs;
    }

    public String getNameHerd() {
        return nameHerd;
    }

    public void setNameHerd(String nameHerd) {
        this.nameHerd = nameHerd;
    }

    public String[] getLambs() {
        return lambs;
    }

    public void setLambs(String[] lambs) {
        this.lambs = lambs;
    }

    @Override
    public Iterator getIterator() {
        return new LambIterator();
    }

    private class LambIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < lambs.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return lambs[index++];
        }
    }
}
