package by.tms.lesson14.task1;

/**
 * В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
 * Проанализировать и записать в другой файл самое длинное слово.
 */
public class Main {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        StringBuilder readBook = analyzer.reader();
        analyzer.FindTheLongestWord(readBook);
        analyzer.WriterToTheLogger();

        /*У меня самое большое слово "serving-creature's" - потому, что я удалил все знаки препинания для
        разбивки на массив слов и это слово оказалось больше всех.
        По ожиданиям преподавателя должно было быть слово "unthankfulness", мой вариант тоже(если не более) правильный
         - поскольку даже со знаками препинания это все ровно одно слово и оно больше того, которое ожидалось*/
    }
}