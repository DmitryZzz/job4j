package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        report = new HtmlReport();
        System.out.println("HtmlReport: ");
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        System.out.println();

        report = new JSONReport();
        System.out.println("JSONReport: ");
        text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
