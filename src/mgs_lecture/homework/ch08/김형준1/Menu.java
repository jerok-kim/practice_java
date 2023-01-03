package mgs_lecture.homework.ch08.김형준1;

public enum Menu {
    COFFEE(1000) {
        @Override
        public String toString() {
            return "커피";
        }
    },
    ICE_TEA(2000) {
        @Override
        public String toString() {
            return "아이스티";
        }
    },
    BREAD(3000) {
        @Override
        public String toString() {
            return "빵";
        }
    };

    private final int menuPrice;

    Menu(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public int getMenuPrice() {
        return menuPrice;
    }
}