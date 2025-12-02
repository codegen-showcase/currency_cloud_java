
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ContactsFindResponse
 */
@JsonDeserialize(builder = ContactsFindResponse.Builder.class)
public final class ContactsFindResponse {
    private final Optional<List<Contact>> contacts;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private ContactsFindResponse(Builder builder) {
        this.contacts = builder.contacts;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `contacts`
     */
    @JsonProperty("contacts")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Contact>> getContacts() {
        return contacts;
    }
    /**
     * Retrieves value for `pagination`
     * Pagination.
     */
    @JsonProperty("pagination")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ContactsFindResponse && equalTo((ContactsFindResponse) other);
    }

    private boolean equalTo(ContactsFindResponse other) {
        return
            contacts.equals(other.contacts) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.contacts,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "ContactsFindResponse{" +
               "contacts=" + contacts + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<Contact>> contacts = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(ContactsFindResponse other) {
            contacts(other.getContacts());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `contacts`
         */
        @JsonSetter("contacts")
        public Builder contacts(Optional<List<Contact>> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * Sets value for `contacts`
         */
        public Builder contacts(List<Contact> contacts) {
            return this.contacts(Optional.ofNullable(contacts));
        }
        /**
         * Sets value for `pagination`
         * Pagination.
         */
        @JsonSetter("pagination")
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        public Builder pagination(Pagination pagination) {
            return this.pagination(Optional.ofNullable(pagination));
        }



        public ContactsFindResponse build() {
            return new ContactsFindResponse(this);
        }
    }

}



