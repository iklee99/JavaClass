// Abstract class
abstract class Document {
    // Abstract method (does not have a body)
    abstract void printContent();
}

// Subclass (inherited from Document)
class PDFDocument extends Document {
    // Providing implementation of abstract method
    void printContent() {
        System.out.println("Printing PDF document content...");
    }
}

// Another subclass (inherited from Document)
class WordDocument extends Document {
    // Providing implementation of abstract method
    void printContent() {
        System.out.println("Printing Word document content...");
    }
}

// Printer class with a method that takes a Document object
class Printer {
    void printDocument(Document doc) { // parameter is the abstract class
        System.out.println("Starting print job...");
        doc.printContent();
        System.out.println("Print job completed.");
    }
}

public class DocumentDemo {
    public static void main (String[] args) {
        // Create instances of subclasses
        Document pdf = new PDFDocument();
        Document word = new WordDocument();

        // Create Printer instance
        Printer printer = new Printer();

        // Use Printer to print documents
        printer.printDocument(pdf);
        // Output: Starting print job... Printing PDF document content... Print job completed.
        printer.printDocument(word);
        // Output: Starting print job... Printing Word document content... Print job completed.
    }
}

