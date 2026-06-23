class lecturer extends person {
    public lecturer(String name, String id) {
        super(name, id);
    }
    @Override
    public void introduce() {
        System.out.println("i am a lecturer");
    }
}
