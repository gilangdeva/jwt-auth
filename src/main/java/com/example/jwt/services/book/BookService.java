package com.example.jwt.services.book;

import com.example.jwt.payloads.requests.BookRequest;
import com.example.jwt.payloads.responses.Response;

public interface BookService {
    Response addBook(BookRequest request);

    Response getBooks();

    Response getBookById(String uuid);

    Response updateBookById(String uuid, BookRequest request);

    Response deleteBookById(String uuid);
}