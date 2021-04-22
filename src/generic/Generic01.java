package generic;

class ClassName<E>{
    private E element;

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }


}

class Generic01{
    public static void main(String[] args) {

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.setElement("10");
        b.setElement(10);

        System.out.println("a data : " + a.getElement());
        System.out.println("a E Type : " + a.getElement().getClass().getName());
        //반환된 변수의 타입 출력
        System.out.println();
        System.out.println("b data : " + b.getElement());
        System.out.println("b E Type : " + b.getElement().getClass().getName());

    }
}
