package io.quarkus.deployment.recording;

import java.util.Objects;

import io.quarkus.runtime.annotations.IgnoreProperty;

public class IgnoredProperties {

    private String notIgnored;
    @IgnoreProperty
    private String ignoredField;

    private transient String anotherIgnoredField;

    public IgnoredProperties() {
    }

    public IgnoredProperties(String notIgnored, String ignoredField, String anotherIgnoredField) {
        this.notIgnored = notIgnored;
        this.ignoredField = ignoredField;
        this.anotherIgnoredField = anotherIgnoredField;
    }

    public String getNotIgnored() {
        return notIgnored;
    }

    public void setNotIgnored(String notIgnored) {
        this.notIgnored = notIgnored;
    }

    public String getIgnoredField() {
        return ignoredField;
    }

    public void setIgnoredField(String ignoredField) {
        this.ignoredField = ignoredField;
    }

    public String getAnotherIgnoredField() {
        return anotherIgnoredField;
    }

    public void setAnotherIgnoredField(String anotherIgnoredField) {
        this.anotherIgnoredField = anotherIgnoredField;
    }

    @IgnoreProperty
    public String getSomethingElse() {
        throw new IllegalStateException("This should not have been called");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        IgnoredProperties that = (IgnoredProperties) o;
        return Objects.equals(notIgnored, that.notIgnored) &&
                Objects.equals(ignoredField, that.ignoredField) &&
                Objects.equals(anotherIgnoredField, that.anotherIgnoredField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notIgnored, ignoredField, anotherIgnoredField);
    }

    @Override
    public String toString() {
        return "IgnoredProperties{" +
                "notIgnored='" + notIgnored + '\'' +
                ", ignoredField='" + ignoredField + '\'' +
                '}';
    }
}
