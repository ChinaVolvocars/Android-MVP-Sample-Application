package meahu.com.mvp;

import android.support.annotation.StringRes;

/**
 * Created by Yuexiaohui on 2017/6/22.
 */

public interface MainView {

    void showMessage(String message);

    void showToast(@StringRes int String);

    void showProgressbar();

    void setDate(String s);


}
