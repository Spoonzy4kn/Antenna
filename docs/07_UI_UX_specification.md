# UI and UX Specification

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026  

---

## 1. Purpose

This document defines the initial user interface and user experience direction for Antenna.

The purpose of this document is to describe how users move through the application, how the main screens are structured, and how the interface should behave.

This document is expected to evolve as the application design becomes more detailed.

---

## 2. UI Philosophy

Antenna should be:

- Simple
- Efficient
- Responsive
- Practical
- Intuitive
- Transparent

The interface should prioritise content, readability, and user control.

The application should avoid unnecessary clutter, excessive prompts, engagement-driven design, and features that distract from browsing and reading.

Antenna should feel like software designed to get out of the user's way.

---

## 3. Primary Navigation

Antenna shall use the following primary navigation structure:

```text
Home
Search
Explore
My Subs
Settings
```

These sections represent the main areas of the application.

The navigation should be clear, predictable, and easy to understand without a tutorial.

---

## 4. Secondary Settings Sections

The following sections shall be available from within Settings:

```text
Appearance
Content
Privacy
Account
FAQ
About
```

These are not primary navigation items because they are not part of the regular browsing flow.

They belong inside Settings to keep the main interface clean.

---

## 5. Navigation Tree

The initial navigation tree is:

```text
Antenna
│
├── Home
│   ├── Feed from My Subs
│   ├── Sort
│   │   ├── Hot / Trending
│   │   ├── Latest
│   │   ├── Top: 24 hours
│   │   ├── Top: Week
│   │   ├── Top: Month
│   │   └── Top: All Time
│   └── Post Detail
│       ├── Content
│       ├── Media
│       └── Comments
│
├── Search
│   ├── Search Input
│   ├── Search Target
│   │   ├── All
│   │   ├── Posts
│   │   ├── Communities / Subreddits
│   │   └── Users
│   ├── Content Type
│   │   ├── Text
│   │   ├── Images
│   │   ├── Videos
│   │   ├── Links
│   │   └── News
│   ├── Sort
│   │   ├── Relevance
│   │   ├── Latest
│   │   ├── Hot / Trending
│   │   ├── Top: 24 hours
│   │   ├── Top: Week
│   │   ├── Top: Month
│   │   └── Top: All Time
│   └── Results
│       ├── Posts
│       ├── Communities
│       └── Users
│
├── Explore
│   ├── Browse by Content Type
│   │   ├── Text
│   │   ├── Images
│   │   ├── Videos
│   │   ├── Links
│   │   └── News
│   ├── Browse Communities
│   │   ├── Popular
│   │   ├── Trending
│   │   ├── New / Growing
│   │   └── Categories
│   ├── Sort
│   │   ├── Hot / Trending
│   │   ├── Latest
│   │   ├── Top: 24 hours
│   │   ├── Top: Week
│   │   ├── Top: Month
│   │   └── Top: All Time
│   └── Results / Feed
│
├── My Subs
│   ├── Local Favourites
│   ├── Add Community
│   ├── Remove Community
│   ├── Open Community
│   ├── Search within My Subs
│   └── Future: Groups / Folders
│
└── Settings
    ├── Appearance
    ├── Content
    │   └── NSFW Visibility
    ├── Privacy
    ├── Account
    ├── FAQ
    └── About
```

---

## 6. Home

Home is the primary feed screen.

Home shall show posts from communities saved in My Subs.

Home is not intended to be a dashboard, welcome page, or promotional landing screen.

### 6.1 Home Behaviour

Home should:

- Display the user's local My Subs feed
- Allow the user to sort the feed
- Preserve scroll position where practical
- Provide access to post detail screens
- Avoid unnecessary prompts or recommendations

### 6.2 Home Empty State

If the user has no saved communities, Home shall display a simple empty state.

The empty state should explain that the user can add communities through Search, Explore, or My Subs.

---

## 7. Home Sorting

Home shall support feed sorting where supported by the connected platform.

Initial sort options:

```text
Hot / Trending
Latest
Top: 24 hours
Top: Week
Top: Month
Top: All Time
```

Home sorting changes the order of posts in the user's My Subs feed.

Home should not include heavy content filtering in Version 1.

---

## 8. Search

Search is for direct lookup.

Search is used when the user already knows what they are looking for.

Search may support:

- Searching all content
- Searching posts
- Searching communities / subreddits
- Searching users

Search should support content type selection where practical.

Content types may include:

```text
Text
Images
Videos
Links
News
```

Search should also support sorting where available.

Initial search sort options:

```text
Relevance
Latest
Hot / Trending
Top: 24 hours
Top: Week
Top: Month
Top: All Time
```

---

## 9. Explore

Explore is for discovery.

Explore is used when the user does not know exactly what they are looking for.

Explore may allow the user to browse by:

- Content type
- Popular communities
- Trending communities
- New or growing communities
- Categories
- Latest content
- Top content

Explore should support content type selection and sorting where available.

Explore is separate from Search because Search is intentional lookup, while Explore is browsing and discovery.

---

## 10. My Subs

My Subs contains locally saved communities.

For anonymous users, My Subs does not mean Reddit account subscriptions. It means local favourites stored by Antenna on the device.

### 10.1 My Subs Behaviour

My Subs shall allow the user to:

- View locally saved communities
- Add a community
- Remove a community
- Open a community
- Search within saved communities

### 10.2 Sorting

My Subs shall be displayed alphabetically.

Manual reordering is not required for Version 1.

Alphabetical sorting is preferred because it is simple, predictable, and practical.

### 10.3 Naming

Community names should use consistent display and storage formatting.

Suggested behaviour:

```text
Display format:
r/example

Storage format:
example
```

Duplicate entries should be prevented.

---

## 11. Settings

Settings contains application configuration and secondary information.

Settings should include the following sections:

```text
Appearance
Content
Privacy
Account
FAQ
About
```

Settings should avoid becoming cluttered.

Each setting should have a clear purpose and plain-language description where needed.

---

## 12. NSFW Visibility

NSFW visibility shall be handled as a global content setting.

The setting shall live under:

```text
Settings → Content → NSFW visibility
```

NSFW content shall be hidden or restricted by default.

Before enabling NSFW visibility, the user must confirm they are over 18.

This setting is local to Antenna and controls how Antenna handles NSFW-labelled content where such content is available through the selected access method.

The setting shall apply globally to:

- Home
- Search
- Explore
- Community feeds
- Post detail screens
- Media views

The setting shall not be treated as a way to bypass Reddit or platform-imposed restrictions.

If Reddit requires an authenticated account or account-level content setting to access NSFW content, Antenna shall respect that requirement and communicate the limitation clearly to the user.

---

## 13. Sort and Filter Distinction

Antenna shall distinguish between sorting and filtering.

### 13.1 Sort

Sort changes the order in which content is displayed.

Examples:

```text
Hot / Trending
Latest
Top: 24 hours
Top: Week
Top: Month
Top: All Time
Relevance
```

### 13.2 Filter

Filter changes what type of content is displayed.

Examples:

```text
Text
Images
Videos
Links
News
Communities
Users
Posts
```

Home should primarily use sorting.

Search and Explore may use both sorting and filtering.

---

## 14. Post Detail

Post Detail is opened when the user selects a post from Home, Search, Explore, or a community feed.

Post Detail should display:

- Post title
- Post body or linked content
- Media where available
- Community
- Author
- Score where available
- Comment count
- Time posted
- Comments

The user should be able to return to the previous feed without losing their position where practical.

---

## 15. Comments

Comments should be readable and easy to navigate.

The comments interface should support:

- Nested comments
- Clear indentation
- Collapse and expand behaviour
- Readable formatting
- Smooth scrolling
- Graceful handling of deleted or removed comments

The interface should prioritise reading discussion over showing excessive action buttons.

---

## 16. Account

Account is a secondary settings section.

For Version 1, Account may simply explain:

- Anonymous browsing is supported where technically possible
- Some actions may require an account
- Login is not required for the initial anonymous browsing experience
- Future account features may include voting, commenting, posting, reporting, messages, notifications, and platform-managed subscriptions

Account-required features should be clearly separated from anonymous features.

---

## 17. FAQ

FAQ is a secondary settings section.

FAQ should provide plain-language answers to common questions.

Initial FAQ topics may include:

- What Antenna is
- What My Subs means
- Why some features require an account
- Why some content may not load
- How NSFW visibility works
- What data Antenna stores
- Whether Antenna includes advertising, telemetry, or analytics
- Compatibility with Reddit

---

## 18. About

About is a secondary settings section.

About should include:

- App name
- App version
- Project status
- License
- Source code link
- Compatibility statement
- Independent project disclaimer
- Credits where appropriate

---

## 19. Initial UI Priorities

The initial UI priorities are:

- Clean main feed
- Simple navigation
- Fast access to Search and Explore
- Easy management of My Subs
- Clear Settings structure
- Readable post and comment screens
- Minimal clutter
- Clear empty, loading, and error states

---

## 20. Summary

Antenna's UI should be structured around five primary areas:

```text
Home
Search
Explore
My Subs
Settings
```

Home is the main feed.

Search is for direct lookup.

Explore is for discovery.

My Subs is for locally saved communities.

Settings contains configuration, account information, FAQ, and About.

The interface should remain simple, efficient, responsive, practical, intuitive, and transparent.