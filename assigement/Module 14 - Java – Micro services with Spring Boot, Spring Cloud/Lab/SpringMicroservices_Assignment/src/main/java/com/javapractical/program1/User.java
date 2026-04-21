package com.javapractical.program1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;

    public boolean isValid() {
        return name != null && !name.isEmpty() && email != null && email.contains("@");
    }
}
