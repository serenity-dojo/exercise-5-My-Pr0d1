package com.serenitydojo.checks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HampsterClassTest {
    @Test
    public void theHampsterClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Hampster")).isNotNull();
    }

    @Test
    public void shouldBeAPet() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Hampster").getSuperclass().getSimpleName()).isEqualTo("Pet");
    }

    @Test
    public void theHampsterClassShouldHaveAFavoriteGame() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Hampster").getDeclaredField("favoriteGame").getGenericType()).isEqualTo(String.class);
    }
}
