# Functional Requirements

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026  

---

## 1. Purpose

This document defines the functional requirements for Antenna.

Functional requirements describe what the application must do from the user's perspective.

Technical implementation details, architecture, database design, and code structure are documented separately.

---

## 2. Requirement Language

The following terms are used throughout this document:

- **Shall** means the requirement is mandatory.
- **Should** means the requirement is expected but may be adjusted if there is a justified reason.
- **May** means the requirement is optional or intended for future consideration.

---

## 3. User Roles

### 3.1 Anonymous User

An anonymous user is a person using Antenna without signing in to a platform account.

An anonymous user shall be able to use the application for browsing and reading publicly available content where supported.

---

### 3.2 Authenticated User

An authenticated user is a person who has signed in to a supported platform account.

Authenticated functionality is not required for the initial Version 1 foundation but may be supported in later releases.

---

## 4. Application Launch

### FR-001: Application Startup

The application shall launch to a usable home screen.

### FR-002: First Launch State

On first launch, the application shall provide a clear starting point for the user.

This may include:

- Search for a community.
- Browse a default feed where supported.
- Add local favourites.
- Open settings.

### FR-003: Returning User State

The application should remember relevant local preferences between sessions.

This may include:

- Theme mode.
- Local favourites.
- NSFW visibility setting.
- Last viewed community where practical.

---

## 5. Home Screen

### FR-004: Home Screen Display

The application shall include a home screen.

The home screen should provide access to:

- Local favourites.
- Search.
- Settings.
- Recently viewed or commonly accessed communities where practical.

### FR-005: Local Feed

The application should support a personalised local feed generated from the user's local favourites.

### FR-006: Empty Favourites State

If the user has no local favourites, the application shall display a useful empty state.

The empty state should explain how to add favourites.

---

## 6. Community Browsing

### FR-007: Open Community

The user shall be able to open a community by name or search result.

### FR-008: Community Feed

The application shall display posts from an opened community where supported.

### FR-009: Community Metadata

The application should display basic community information where available.

This may include:

- Community name.
- Description.
- Subscriber count.
- NSFW status.

### FR-010: Community Sorting

The application should allow sorting of community posts where supported.

Sort options may include:

- Hot.
- New.
- Top.
- Rising.

Available sort options may depend on the connected platform.

### FR-011: Community Error State

If a community cannot be loaded, the application shall display a clear error message.

Possible causes include:

- Community does not exist.
- Community is private or restricted.
- Network failure.
- Platform access restriction.
- Unsupported content.

---

## 7. Post Feed

### FR-012: Feed Display

The application shall display posts in a readable feed layout.

### FR-013: Post Preview

Each post preview should display relevant information where available.

This may include:

- Title.
- Community.
- Author.
- Score.
- Comment count.
- Post type.
- Thumbnail or preview image.
- NSFW indicator.
- Time posted.

### FR-014: Feed Scrolling

The user shall be able to scroll through a feed smoothly.

### FR-015: Feed Refresh

The user should be able to refresh a feed manually.

### FR-016: Pagination

The application should support loading additional posts as the user scrolls where supported.

### FR-017: Feed State Preservation

The application should preserve feed position where practical.

This is intended to reduce the chance of users losing their place unintentionally.

---

## 8. Post Viewing

### FR-018: Open Post

The user shall be able to open a post from a feed.

### FR-019: Post Detail Screen

The application shall provide a post detail screen.

The post detail screen should display:

- Full title.
- Body text where applicable.
- Media where applicable.
- Link destination where applicable.
- Community.
- Author.
- Score.
- Comment count.
- Time posted.
- Comments.

### FR-020: Text Posts

The application shall support viewing text posts.

### FR-021: Link Posts

The application shall support viewing link posts.

External links should open in an appropriate browser or in-app browser depending on future design decisions.

### FR-022: Image Posts

The application shall support viewing image posts where supported.

### FR-023: Gallery Posts

The application should support viewing gallery posts where supported.

### FR-024: Video Posts

The application should support viewing video posts where supported.

Video support may be limited by platform access, media format, or technical constraints.

### FR-025: Unsupported Post Types

If a post type is unsupported, the application shall display a clear message rather than fail silently.

---

## 9. Comment Viewing

### FR-026: Load Comments

The application shall load and display comments for a post where supported.

### FR-027: Nested Comments

The application shall display nested comments with a clear visual hierarchy.

### FR-028: Collapse Comments

The user shall be able to collapse and expand comment threads.

### FR-029: Comment Metadata

Each comment should display relevant metadata where available.

This may include:

- Author.
- Score.
- Time posted.
- Edited status.
- Reply count.

### FR-030: Deleted or Removed Comments

The application shall handle deleted or removed comments gracefully.

### FR-031: Large Comment Threads

The application should handle large comment threads without becoming unresponsive.

### FR-032: Comment Readability

Comments shall be displayed in a readable format.

Formatting such as links, paragraphs, quotes, and code blocks should be supported where practical.

---

## 10. Search

### FR-033: Community Search

The application should allow users to search for communities where supported.

### FR-034: Post Search

The application should allow users to search for posts where supported.

### FR-035: Search Results

Search results should display enough information for the user to choose the correct result.

### FR-036: Search Error State

If search fails, the application shall display a clear message.

---

## 11. Local Favourites

### FR-037: Add Local Favourite

The user shall be able to add a community to local favourites.

### FR-038: Remove Local Favourite

The user shall be able to remove a community from local favourites.

### FR-039: View Local Favourites

The user shall be able to view their local favourites.

### FR-040: Local Favourite Storage

Local favourites shall be stored on the device.

### FR-041: Local Favourite Independence

Local favourites shall remain independent of platform-managed subscriptions.

### FR-042: Local Favourite Feed

The application should use local favourites to generate a personalised local feed.

### FR-043: Local Favourite Empty State

If no favourites exist, the application shall explain how to add them.

---

## 12. NSFW Content

### FR-044: NSFW Default State

NSFW content shall be hidden or restricted by default.

### FR-045: Over 18 Confirmation

The application shall require the user to confirm they are over 18 before enabling NSFW visibility.

### FR-046: NSFW Setting

The application shall provide a local NSFW visibility setting.

### FR-047: NSFW Indicators

NSFW content should be clearly identified where available.

### FR-048: Platform Restrictions

The application shall respect restrictions imposed by the connected platform.

The local NSFW setting shall not be treated as a way to override platform restrictions.

---

## 13. Settings

### FR-049: Settings Screen

The application shall provide a settings screen.

### FR-050: Theme Setting

The application shall allow the user to configure theme behaviour.

Theme options may include:

- System default.
- Light mode.
- Dark mode.

### FR-051: NSFW Setting Access

The application shall provide access to the NSFW visibility setting from the settings screen.

### FR-052: Privacy Information

The application should provide clear privacy information.

This may include:

- Whether telemetry is used.
- Whether analytics are used.
- What data is stored locally.
- What permissions are requested.

### FR-053: Application Information

The settings screen should display application information.

This may include:

- App version.
- License.
- Source code link.
- Compatibility information.

---

## 14. Privacy and Data Control

### FR-054: No Advertising

The application shall not include advertising of its own.

### FR-055: No Telemetry by Default

The application shall not include telemetry by default.

### FR-056: No Analytics by Default

The application shall not include analytics by default.

### FR-057: Local Data Visibility

The application should make locally stored user data understandable to the user.

### FR-058: Clear Local Data

The application should allow users to clear relevant local data.

This may include:

- Cache.
- Local favourites.
- Search history.
- Recently viewed items.

---

## 15. Error Handling

### FR-059: Network Failure

If the network is unavailable, the application shall display a clear error message.

### FR-060: Empty Results

If no content is available, the application shall display a useful empty state.

### FR-061: Rate Limits

If platform rate limits are encountered, the application shall display a clear message where detectable.

### FR-062: Access Restrictions

If content cannot be accessed due to platform restrictions, the application shall communicate this clearly.

### FR-063: Unexpected Errors

Unexpected errors should be handled gracefully without crashing the application where practical.

---

## 16. Account-Based Features

Account-based features are not required for the initial Version 1 foundation.

The following features may be considered in later releases:

- Login.
- Voting.
- Commenting.
- Posting.
- Reporting.
- Platform-managed subscriptions.
- Messages.
- Notifications.
- Account settings.

### FR-064: Account Features Separation

The application shall clearly separate anonymous functionality from account-required functionality.

### FR-065: Account Requirement Messaging

If a feature requires an account, the application should clearly explain that requirement.

---

## 17. Documentation Requirements

### FR-066: User Documentation

The project should include basic user documentation.

### FR-067: Developer Documentation

The project should include developer documentation sufficient to build and understand the application.

### FR-068: Decision Documentation

Significant design or architecture decisions should be recorded in the decision log.

---

## 18. Version 1 Foundation Requirements

For the Version 1 foundation, Antenna shall provide:

- Application launch.
- Basic navigation.
- Community browsing.
- Post feed viewing.
- Post detail viewing.
- Comment viewing.
- Local favourites.
- Basic settings.
- Dark mode.
- NSFW visibility setting where permitted.
- No advertising of its own.
- No telemetry or analytics by default.

---

## 19. Future Functional Considerations

The following features are not required for the initial foundation but may be considered later:

- Account login.
- Voting.
- Commenting.
- Posting.
- Reporting.
- Download manager.
- Offline reading.
- Backup and restore.
- Community grouping.
- Custom feeds.
- Gesture navigation.
- Tablet layouts.
- Advanced filters.
- Multi-account support.

---

## 20. Summary

This document defines the functional requirements for Antenna.

The core functional goal is to provide a clean, responsive, privacy-conscious Android application for browsing community-driven content, initially compatible with Reddit.

The application should remain useful without requiring an account wherever technically possible, while keeping account-required functionality clearly separated.