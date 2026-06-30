# Functional Requirements

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## 1. Purpose

This document defines the functional requirements for Antenna.

Functional requirements describe what the application must do from the user's perspective. Technical implementation details, architecture, database design, and code structure are documented separately.

## 2. Requirement language

- **Shall:** mandatory requirement.
- **Should:** expected requirement that may be adjusted with justification.
- **May:** optional or future-consideration requirement.
- **Must not:** explicit prohibition.

## 3. User roles

### 3.1 Anonymous user

An anonymous user is a person using Antenna without signing in to a platform account.

An anonymous user shall be able to use the application for browsing and reading publicly available content where supported.

### 3.2 Authenticated user

An authenticated user is a person who has signed in to a supported platform account.

Authenticated functionality is not required for the initial Version 1 foundation but may be supported in later releases.

### 3.3 Contributor

A contributor is a person who works on the application, documentation, testing, design, or project maintenance.

Contributor-facing requirements appear in documentation, architecture, testing, and release documents rather than in the user-facing functional requirement set.

---

## 4. Application launch

### FR-001: Application startup

The application shall launch to a usable home screen or first-launch state.

### FR-002: First-launch state

On first launch, the application shall provide a clear starting point for the user.

This may include:

- Search for a community.
- Explore content where supported.
- Add local favourites.
- Open settings.
- Read a short explanation of My Subs.

### FR-003: Returning-user state

The application should remember relevant local preferences between sessions.

This may include:

- Theme mode.
- Local favourites.
- NSFW visibility setting.
- Last viewed community where practical.
- Last selected sort option where practical.

### FR-004: Launch failure handling

If the application cannot initialise required local state, it shall display a recoverable error where practical rather than crash silently.

---

## 5. Home screen

### FR-005: Home screen display

The application shall include a Home screen.

The Home screen should provide access to:

- Local favourites / My Subs feed.
- Search.
- Explore.
- Settings.
- Recently viewed or commonly accessed communities where practical.

### FR-006: Local feed

The application should support a personalised local feed generated from the user's local favourites where supported by the connected platform.

### FR-007: Empty favourites state

If the user has no local favourites, the Home screen shall display a useful empty state.

The empty state should explain how to add favourites through Search, Explore, or My Subs.

### FR-008: Feed refresh

The user should be able to manually refresh the Home feed where supported.

### FR-009: Feed state preservation

The application should preserve Home feed position where practical to reduce accidental loss of context.

### FR-010: Home sort

The Home feed should support sorting where supported.

Initial sort options may include:

- Hot / Trending.
- Latest.
- Top: 24 hours.
- Top: Week.
- Top: Month.
- Top: All Time.

---

## 6. Community browsing

### FR-011: Open community

The user shall be able to open a community by name or search result where supported.

### FR-012: Community feed

The application shall display posts from an opened community where supported.

### FR-013: Community metadata

The application should display basic community information where available.

This may include:

- Community name.
- Description.
- Subscriber count.
- NSFW status.
- Access restriction status.

### FR-014: Community sorting

The application should allow sorting of community posts where supported.

Sort options may include:

- Hot / Trending.
- Latest / New.
- Top.
- Rising.

Available sort options may depend on the connected platform.

### FR-015: Community error state

If a community cannot be loaded, the application shall display a clear error message.

Possible causes include:

- Community does not exist.
- Community is private or restricted.
- Network failure.
- Platform access restriction.
- Unsupported content.
- Rate limit.

### FR-016: Recently viewed communities

The application may store recently viewed communities locally where this improves usability and is explained to the user.

---

## 7. Post feed

### FR-017: Feed display

The application shall display posts in a readable feed layout.

### FR-018: Post preview

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

### FR-019: Feed scrolling

The user shall be able to scroll through a feed smoothly.

### FR-020: Feed refresh

The user should be able to refresh a feed manually.

### FR-021: Pagination

The application should support loading additional posts as the user scrolls where supported.

### FR-022: Feed position preservation

The application should preserve feed position where practical.

### FR-023: Feed empty state

If no posts are available, the application shall display a useful empty state.

### FR-024: Feed unsupported state

If feed content cannot be displayed because of unsupported data, the application shall explain the limitation.

---

## 8. Post viewing

### FR-025: Open post

The user shall be able to open a post from a feed.

### FR-026: Post detail screen

The application shall provide a post detail screen.

The post detail screen should display:

- Full title.
- Body text where applicable.
- Media where applicable.
- Link destination where applicable.
- Community.
- Author.
- Score where available.
- Comment count where available.
- Time posted.
- Comments where supported.

### FR-027: Text posts

The application shall support viewing text posts.

### FR-028: Link posts

The application shall support viewing link posts.

External links should open in an appropriate browser or in-app browser depending on future design decisions.

### FR-029: Image posts

The application shall support viewing image posts where supported.

### FR-030: Gallery posts

The application should support viewing gallery posts where supported.

### FR-031: Video posts

The application should support viewing video posts where supported.

Video support may be limited by platform access, media format, or technical constraints.

### FR-032: Unsupported post types

If a post type is unsupported, the application shall display a clear message rather than fail silently.

### FR-033: Return to feed

The user should be able to return from post detail to the previous feed without losing their place where practical.

---

## 9. Comment viewing

### FR-034: Load comments

The application shall load and display comments for a post where supported.

### FR-035: Nested comments

The application shall display nested comments with a clear visual hierarchy.

### FR-036: Collapse comments

The user shall be able to collapse and expand comment threads.

### FR-037: Comment metadata

Each comment should display relevant metadata where available.

This may include:

- Author.
- Score.
- Time posted.
- Edited status.
- Reply count.

### FR-038: Deleted or removed comments

The application shall handle deleted or removed comments gracefully.

### FR-039: Large comment threads

The application should handle large comment threads without becoming unresponsive.

### FR-040: Comment readability

Comments shall be displayed in a readable format.

Formatting such as links, paragraphs, quotes, and code blocks should be supported where practical.

### FR-041: Comment loading state

The application shall indicate when comments are loading.

### FR-042: Comment error state

If comments cannot be loaded, the application shall display a clear error message.

---

## 10. Search

### FR-043: Community search

The application should allow users to search for communities where supported.

### FR-044: Post search

The application should allow users to search for posts where supported.

### FR-045: User search

The application may allow users to search for users where supported and if it remains within Version 1 scope.

### FR-046: Search results

Search results should display enough information for the user to choose the correct result.

### FR-047: Search target selection

Search may support target selection such as:

- All.
- Posts.
- Communities / subreddits.
- Users where supported.

### FR-048: Search content-type filtering

Search may support filtering by content type where supported.

Content types may include:

- Text.
- Images.
- Videos.
- Links.
- News.

### FR-049: Search sorting

Search should support sorting where available.

Initial search sort options may include:

- Relevance.
- Latest.
- Hot / Trending.
- Top: 24 hours.
- Top: Week.
- Top: Month.
- Top: All Time.

### FR-050: Search error state

If search fails, the application shall display a clear message.

### FR-051: Search empty state

If search returns no results, the application shall display a useful empty state.

---

## 11. Explore

### FR-052: Explore screen

The application shall include an Explore screen where discovery functionality is supported.

### FR-053: Browse by content type

Explore may allow users to browse by content type where supported.

### FR-054: Browse communities

Explore may allow users to browse popular, trending, new, growing, or categorised communities where supported.

### FR-055: Explore sorting

Explore should support sorting where available.

### FR-056: Explore empty state

If Explore content is unavailable, the application shall display a useful empty or unavailable state.

### FR-057: Explore policy dependency

Explore features that depend on platform discovery endpoints shall be documented as platform-dependent.

---

## 12. Local favourites / My Subs

### FR-058: Add local favourite

The user shall be able to add a community to local favourites.

### FR-059: Remove local favourite

The user shall be able to remove a community from local favourites.

### FR-060: View local favourites

The user shall be able to view their local favourites.

### FR-061: Local favourite storage

Local favourites shall be stored on the device.

### FR-062: Local favourite independence

Local favourites shall remain independent of platform-managed subscriptions.

### FR-063: Local favourite feed

The application should use local favourites to generate a personalised local feed where supported.

### FR-064: Local favourite empty state

If no favourites exist, the application shall explain how to add them.

### FR-065: Local favourite sorting

My Subs shall be sorted alphabetically for Version 1.

### FR-066: Duplicate prevention

The application shall prevent duplicate local favourites.

### FR-067: Community name normalisation

The application should use consistent community naming.

Suggested behaviour:

```text
Display format: r/example
Storage format: example
```

---

## 13. NSFW content

### FR-068: NSFW default state

NSFW content shall be hidden or restricted by default.

### FR-069: Over-18 confirmation

The application shall require the user to confirm they are over 18 before enabling NSFW visibility.

### FR-070: NSFW setting

The application shall provide a local NSFW visibility setting.

### FR-071: NSFW indicators

NSFW content should be clearly identified where available.

### FR-072: Platform restrictions

The application shall respect restrictions imposed by the connected platform.

The local NSFW setting shall not be treated as a way to override platform restrictions.

### FR-073: Global NSFW behaviour

The NSFW visibility setting shall apply consistently across Home, Search, Explore, community feeds, post detail screens, and media views where supported.

---

## 14. Settings

### FR-074: Settings screen

The application shall provide a Settings screen.

### FR-075: Appearance settings

The application shall allow the user to configure theme behaviour.

Theme options may include:

- System default.
- Light mode.
- Dark mode.

### FR-076: Content settings

The application shall provide content-related settings, including NSFW visibility where permitted.

### FR-077: Privacy information

The application should provide clear privacy information.

This may include:

- Whether telemetry is used.
- Whether analytics are used.
- What data is stored locally.
- What permissions are requested.
- What platform access limitations apply.

### FR-078: Account information

The Settings area should include an Account section that explains anonymous use and account-required limitations.

### FR-079: FAQ

The Settings area should include an FAQ section with common user questions.

### FR-080: About

The Settings area should display application information.

This may include:

- App name.
- App version.
- License.
- Source code link.
- Compatibility statement.
- Independent project disclaimer.

---

## 15. Privacy and data control

### FR-081: No advertising

The application shall not include advertising of its own.

### FR-082: No telemetry by default

The application shall not include telemetry by default.

### FR-083: No analytics by default

The application shall not include analytics by default.

### FR-084: Local data visibility

The application should make locally stored user data understandable to the user.

### FR-085: Clear local data

The application should allow users to clear relevant local data.

This may include:

- Cache.
- Local favourites.
- Search history if implemented.
- Recently viewed items if implemented.

---

## 16. Error handling

### FR-086: Network failure

If the network is unavailable, the application shall display a clear error message.

### FR-087: Empty results

If no content is available, the application shall display a useful empty state.

### FR-088: Rate limits

If platform rate limits are encountered, the application shall display a clear message where detectable.

### FR-089: Access restrictions

If content cannot be accessed due to platform restrictions, the application shall communicate this clearly.

### FR-090: Unexpected errors

Unexpected errors should be handled gracefully without crashing the application where practical.

### FR-091: Unsupported content

Unsupported content shall be communicated clearly instead of being omitted silently where practical.

---

## 17. Account-based features

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

### FR-092: Account features separation

The application shall clearly separate anonymous functionality from account-required functionality.

### FR-093: Account requirement messaging

If a feature requires an account, the application should clearly explain that requirement.

---

## 18. Documentation requirements

### FR-094: User documentation

The project should include user documentation.

### FR-095: Developer documentation

The project should include developer documentation sufficient to build and understand the application.

### FR-096: Decision documentation

Significant design or architecture decisions should be recorded in the decision log.

### FR-097: Build documentation

Once implementation begins, the project shall document build requirements and commands.

### FR-098: Release documentation

The project should document release steps before a public release is tagged.

---

## 19. Version 1 foundation requirement summary

For the Version 1 foundation, Antenna shall provide:

- Application launch.
- Basic navigation.
- Home.
- Search.
- Explore where supported.
- My Subs.
- Settings.
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
- Clear error handling.
- Documentation sufficient for future development.

## 20. Future functional considerations

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
- Additional platform compatibility.

## 21. Summary

This document defines the functional requirements for Antenna.

The core functional goal is to provide a clean, responsive, privacy-conscious Android application for browsing community-driven content, initially compatible with Reddit.

The application should remain useful without requiring an account wherever technically possible, while keeping account-required functionality clearly separated.
