# User Stories and Journeys

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document translates Antenna's scope and functional requirements into user stories and end-to-end journeys.

Stories should be used to create implementation issues, acceptance criteria, manual tests, and future automated tests.

---

## 2. Story format

Stories use the following format:

```text
As a <user role>, I want <capability>, so that <outcome>.
```

Acceptance criteria are written as observable behaviours.

---

## 3. Anonymous browsing stories

### US-001: Launch the app

As an anonymous user, I want the app to open to a usable starting point, so that I can begin browsing without setup confusion.

Acceptance criteria:

- App opens without requiring account login.
- User sees Home or a useful first-launch state.
- User can reach Search, Explore, My Subs, and Settings.

### US-002: Open a community

As an anonymous user, I want to open a community by name or result, so that I can browse its posts.

Acceptance criteria:

- User can enter or select a community.
- Supported community loads a feed.
- Restricted, missing, or unavailable community shows clear messaging.

### US-003: Browse posts

As an anonymous user, I want to scroll through posts in a readable feed, so that I can choose what to open.

Acceptance criteria:

- Feed item title is readable.
- Metadata is visible where available.
- NSFW content is hidden or labelled according to settings and restrictions.
- Feed scroll remains smooth under normal conditions.

### US-004: Read post detail

As an anonymous user, I want to open a post, so that I can read the full content and related discussion.

Acceptance criteria:

- Post detail displays title, body/media/link where supported, and metadata.
- Unsupported content shows a clear unsupported state.
- Back navigation returns to the previous feed where practical.

### US-005: Read comments

As an anonymous user, I want to read nested comments, so that I can follow the discussion.

Acceptance criteria:

- Comments load where supported.
- Nested replies are visually clear.
- Deleted and removed comments are handled gracefully.
- User can collapse and expand comment threads.

---

## 4. Local favourites stories

### US-006: Add local favourite

As an anonymous user, I want to save a community locally, so that I can return to it without an account.

Acceptance criteria:

- User can add a community to My Subs.
- Saved community appears in My Subs.
- Saved community persists after app restart.
- Duplicate favourites are prevented.

### US-007: Remove local favourite

As an anonymous user, I want to remove a saved community, so that My Subs stays relevant.

Acceptance criteria:

- User can remove a community from My Subs.
- Community disappears from My Subs.
- Removal affects Home feed sources where implemented.

### US-008: View My Subs

As an anonymous user, I want to view saved communities, so that I can quickly open them.

Acceptance criteria:

- My Subs displays saved communities alphabetically.
- Empty state explains how to add communities.
- User can open a saved community.

---

## 5. Search and discovery stories

### US-009: Search communities

As a user, I want to search for communities, so that I can find content I already know I want.

Acceptance criteria:

- Search input is clear.
- Results display enough information to choose a community.
- Empty, error, and restricted states are clear.

### US-010: Search posts

As a user, I want to search for posts where supported, so that I can find specific content.

Acceptance criteria:

- Search supports post results where platform access permits.
- Results show title and context.
- Unsupported search features are not presented misleadingly.

### US-011: Explore content

As a user, I want to browse discovery surfaces, so that I can find communities or posts without a specific query.

Acceptance criteria:

- Explore provides discovery options where supported.
- Explore is separate from Search.
- Sorting and filtering are clearly distinguished.

---

## 6. Settings stories

### US-012: Change theme

As a user, I want to choose theme behaviour, so that the app matches my device or preference.

Acceptance criteria:

- Theme setting is available under Appearance.
- Supported options include system/default, light, and dark where implemented.
- Setting persists between sessions.

### US-013: Control NSFW visibility

As a user, I want NSFW visibility to be disabled by default and controlled through settings, so that content visibility is predictable.

Acceptance criteria:

- NSFW visibility is disabled by default.
- User must confirm they are over 18 before enabling visibility.
- Setting does not override platform restrictions.
- NSFW content is labelled where available.

### US-014: Understand privacy behaviour

As a privacy-conscious user, I want clear privacy information, so that I understand what Antenna stores and does not collect.

Acceptance criteria:

- Settings explains no advertising, telemetry, or analytics by default.
- Settings explains local favourites and local settings.
- Cache and local data controls are available where implemented.

---

## 7. Contributor stories

### US-015: Understand project scope

As a contributor, I want clear scope and requirements, so that I can build the right thing.

Acceptance criteria:

- Documentation index identifies all major documents.
- Scope and requirements are traceable.
- Out-of-scope items are explicit.

### US-016: Understand architecture

As a contributor, I want a clear architecture direction, so that I can place code in the correct module or layer.

Acceptance criteria:

- Architecture identifies layers and module responsibilities.
- UI does not directly perform network/database work.
- Platform-specific code remains isolated.

---

## 8. End-to-end journey: first useful session

1. User launches Antenna.
2. User opens Search or Explore.
3. User finds a community.
4. User opens the community feed.
5. User opens a post.
6. User reads comments.
7. User saves the community to My Subs.
8. User returns later and opens Home/My Subs.

Success outcome: the user has browsed and personalised the app without creating an account.

---

## 9. Summary

The initial user story set focuses on browsing, reading, local favourites, simple settings, privacy transparency, and contributor clarity. These are the behaviours that should guide the Version 1 implementation backlog.
