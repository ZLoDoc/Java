package OOP.Lecture.Lecture2.Ex006.Interface;

import Lesson_08.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}