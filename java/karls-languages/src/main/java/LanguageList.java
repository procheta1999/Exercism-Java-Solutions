import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        try
        {
            return languages.isEmpty();
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the isEmpty() method");
        }
    }

    public void addLanguage(String language) {
        try
        {
            languages.add(language);
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the addLanguage() method");
        }
    }

    public void removeLanguage(String language) {
        try
        {
            languages.remove(language);
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the removeLanguage() method");
        }
    }

    public String firstLanguage() {
        try
        {
            return languages.get(0);
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the firstLanguage() method");
        }
    }

    public int count() {
        try
        {
            return languages.size();
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the count() method");
        }
    }

    public boolean containsLanguage(String language) {
        try
        {
            return languages.contains(language);
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the containsLanguage() method");
        }
    }

    public boolean isExciting() {
        try
        {
            if(languages.contains("Java")==true || languages.contains("Kotlin")==true)
            {
                return true;
            }
            return false;
        }
        catch(UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Please implement the isExciting() method");
        }
    }
}
