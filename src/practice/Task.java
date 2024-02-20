package practice;

import java.time.LocalDate;

// Comparableインタフェースを実装する
public class Task implements Comparable<Task> {
  private LocalDate date;
  private String task;
  public Task(LocalDate date, String task){
    this.date = date;
    this.task = task;
  }

  public LocalDate getDate() {
    return date;
  }

  public String getTask() {
    return task;
  }

  // compareToメソッドをオーバーライドする
  // 日付で並び替えるため、LocalDateのcompareToを使う
  @Override
  public int compareTo(Task t){
    return date.compareTo(t.date);
  }
}