public class Word {
    String word;

    public Word(String word){
        this.word = word;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Word){
            Word other = (Word) obj;
        }
        return false;
    }
}
