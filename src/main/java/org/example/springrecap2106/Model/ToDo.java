package org.example.springrecap2106.Model;

import lombok.With;
import org.springframework.data.annotation.Id;

@With
public record ToDo(
        @Id
        String id,
        String description,
        Status status) {
}
