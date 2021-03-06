package com.wiley.autotest.selenium.elements.upgrade.v3.conditions.window;

/**
 * Created by vefimov on 31/05/2017.
 */
public class WindowMatcher {

    private WindowFinder finder;

    private WindowMatcher(WindowFinder finder) {
        this.finder = finder;
    }

    public WindowFinder get() {
        return finder;
    }

    public static WindowMatcher byTitle(String title) {
        return new WindowMatcher(new WindowByTitle(title));
    }

    public static WindowMatcher byUrl(String url) {
        return new WindowMatcher(new WindowByUrl(url));
    }

}
