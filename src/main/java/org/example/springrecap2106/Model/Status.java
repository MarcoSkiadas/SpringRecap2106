package org.example.springrecap2106.Model;

public enum Status {
    OPEN("OPEN"),
    IN_PROGRESS("IN_PROGRESS"),
    DONE("DONE");

private final String status;

Status(String status) {
this.status = status;}

}
