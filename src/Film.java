public class Film {
    private String title;
    private String nameOfDirector;
    private boolean isPorno;

    public Film(String title, String nameOfDirector, boolean isPorno){

        this.title = title;
        this.nameOfDirector = nameOfDirector;
        this.isPorno = isPorno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }

    public boolean isPorno() {
        return isPorno;
    }

    public void setPorno(boolean porno) {
        isPorno = porno;
    }
}
