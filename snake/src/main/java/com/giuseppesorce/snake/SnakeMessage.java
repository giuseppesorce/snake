package com.giuseppesorce.snake;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * @author Giuseppe Sorce
 */

public final class SnakeMessage {


    public static Snackbar show(View view, String message) {
        Snackbar snake = Snackbar.make(view, message, 1000);
        snake.show();
        return snake;
    }
}
