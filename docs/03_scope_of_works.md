# Scope of Works

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026  

---

## 1. Purpose

This document defines the initial scope of works for Antenna.

The purpose of this document is to describe what the project will deliver, what is currently excluded, and the boundaries that will guide Version 1 development.

This document is not intended to define every technical implementation detail. Technical design decisions will be recorded separately in the architecture documentation and decision log.

---

## 2. Project Summary

Antenna is an open-source Android application designed to provide a simple, efficient, responsive, practical, intuitive, and transparent interface for browsing community-driven discussion platforms.

Version 1 is intended to be compatible with Reddit.

The project aims to provide a cleaner and more user-focused browsing experience while remaining maintainable, transparent, and respectful of the technical and policy constraints of the platform it connects to.

---

## 3. Project Objectives

The primary objectives of Antenna are to:

- Provide a clean Android browsing experience for community-driven content.
- Support anonymous browsing wherever technically possible.
- Allow users to locally favourite communities without requiring an account.
- Provide a responsive and intuitive user interface.
- Avoid advertising, telemetry, and analytics by default.
- Build a maintainable open-source codebase.
- Establish a strong foundation for future development.

---

## 4. Version 1 Scope

Version 1 will focus on establishing a stable, usable, and maintainable application foundation.

The initial release does not need to match every feature of existing commercial applications. The priority is to deliver a working application that demonstrates the core user experience and architectural direction.

Version 1 shall include:

- Android application foundation.
- Clean user interface.
- Community browsing.
- Post browsing.
- Comment viewing.
- Local favourites.
- Basic search.
- Local settings.
- Dark mode.
- NSFW visibility setting where permitted.
- No advertising within the application.
- No telemetry or analytics by default.
- Basic documentation.

---

## 5. Functional Scope

### 5.1 Community Browsing

The application shall allow users to browse communities available through the connected platform.

Users should be able to:

- Open a community directly.
- View a list of posts from a community.
- Sort or filter posts where supported.
- Return to previously viewed communities.

---

### 5.2 Post Browsing

The application shall allow users to view posts.

Posts may include:

- Text posts.
- Link posts.
- Image posts.
- Gallery posts.
- Video posts, where supported.
- Metadata such as title, author, score, community, and comment count.

The application should present posts in a clean and readable format.

---

### 5.3 Comment Viewing

The application shall allow users to read comments on posts.

The comment interface should support:

- Nested comment threads.
- Collapse and expand behaviour.
- Clear visual hierarchy.
- Smooth scrolling.
- Readable formatting.

Commenting is not required for anonymous use.

---

### 5.4 Local Favourites

The application shall allow users to favourite communities locally.

Local favourites shall:

- Not require an online account.
- Be stored on the device.
- Be editable by the user.
- Be used to build a personalised local feed.
- Remain separate from platform-managed subscriptions.

Future versions may support backup, restore, grouping, or syncing of local favourites.

---

### 5.5 Search

The application shall provide basic search functionality where supported.

Search may include:

- Searching for communities.
- Searching for posts.
- Opening a result directly.

Search capability will depend on the connected platform and available access method.

---

### 5.6 Anonymous Use

Antenna should remain useful without requiring the user to sign in.

Where supported, anonymous users should be able to:

- Browse communities.
- View posts.
- Read comments.
- Search.
- Manage local favourites.
- Configure local settings.
- View permitted media.

Actions that require an authenticated account are outside the anonymous feature set.

---

### 5.7 Account-Based Features

Account-based features are not mandatory for the initial Version 1 release.

Where supported in future versions, account login may enable:

- Voting.
- Commenting.
- Posting.
- Reporting.
- Platform-managed subscriptions.
- Messages.
- Notifications.
- Account-specific preferences.

These features will be implemented only if they can be supported properly and within applicable platform constraints.

---

### 5.8 NSFW Content

The application shall include a local NSFW visibility setting.

The intended behaviour is:

- SFW content is shown by default.
- NSFW content is hidden or restricted by default.
- A user may enable NSFW visibility after confirming they are over 18.
- The application shall respect platform restrictions relating to NSFW content.

The local setting does not override restrictions imposed by the connected platform.

---

### 5.9 Settings

The application shall include a basic settings area.

Initial settings may include:

- Theme mode.
- NSFW visibility.
- Local favourites management.
- Cache controls.
- Privacy information.
- Application version information.

Settings should be simple and clearly explained.

---

## 6. Non-Functional Scope

Antenna shall be designed to meet the following non-functional goals.

### 6.1 Performance

The application should:

- Launch quickly.
- Scroll smoothly.
- Avoid unnecessary delays.
- Use caching where practical.
- Avoid excessive memory use.
- Avoid unnecessary network requests.

---

### 6.2 Privacy

The application should:

- Avoid unnecessary data collection.
- Avoid telemetry by default.
- Avoid analytics by default.
- Avoid advertising.
- Request only necessary permissions.
- Store user preferences locally where practical.

---

### 6.3 Maintainability

The codebase should be:

- Modular.
- Readable.
- Documented.
- Testable.
- Suitable for open-source collaboration.

Implementation should avoid unnecessary complexity.

---

### 6.4 Reliability

The application should handle common failure conditions gracefully, including:

- Network failure.
- Empty results.
- Unavailable communities.
- Unsupported content types.
- Rate limits or access restrictions.
- Malformed or unexpected data.

Users should receive clear feedback when something cannot be loaded.

---

### 6.5 Transparency

The application should be clear about:

- What data it stores.
- What permissions it requests.
- What features require platform access.
- What features require an account.
- What limitations are imposed by the connected platform.

---

## 7. Technical Scope

Version 1 is expected to use:

- Native Android development.
- Kotlin.
- Jetpack Compose.
- Local storage for settings and favourites.
- A modular project structure.
- A networking layer compatible with the selected platform access method.

Specific architecture decisions will be documented separately.

---

## 8. External Constraints

Antenna Version 1 is intended to be compatible with Reddit.

The application shall use supported access methods and shall not be designed around bypassing technical or policy restrictions.

Some features may depend on:

- Platform API availability.
- Platform terms of service.
- Authentication requirements.
- Rate limits.
- Content restrictions.
- Media access limitations.

If a desired feature cannot be implemented within these constraints, it shall be documented and deferred or removed from scope.

---

## 9. Out of Scope for Version 1

The following items are outside the scope of Version 1:

- iOS application.
- Desktop application.
- Web application.
- Multiple content platforms.
- Plugin architecture.
- Cloud synchronisation.
- AI features.
- Full account management.
- Moderation tools.
- Advanced theming.
- Advanced media downloading.
- In-app purchases.
- Advertising.
- Telemetry or analytics by default.

These items may be reconsidered in later versions if they align with the project principles.

---

## 10. Future Considerations

Potential future enhancements include:

- Account login.
- Voting.
- Commenting.
- Posting.
- Reporting.
- Multi-account support.
- Offline reading.
- Download manager.
- Backup and restore.
- Community grouping.
- Custom feeds.
- Gesture navigation.
- Tablet layouts.
- Accessibility enhancements.
- Advanced filtering.
- Additional platform compatibility.

Future features must be evaluated against the project principles before being added to scope.

---

## 11. Deliverables

The initial project deliverables are:

- Open-source repository.
- Project documentation.
- Scope of works.
- Functional requirements.
- Non-functional requirements.
- Architecture documentation.
- Android application source code.
- Working pre-alpha build.
- Basic user documentation.

---

## 12. Definition of Done for Version 1 Foundation

The Version 1 foundation will be considered complete when:

- The application can be built from source.
- The application launches successfully on a supported Android device.
- Users can browse compatible community content.
- Users can open posts.
- Users can read comments.
- Users can manage local favourites.
- Basic settings are available.
- The application contains no advertising of its own.
- The repository includes sufficient documentation for future development.

---

## 13. Change Control

Changes to this scope should be made deliberately.

If a significant feature is added, removed, or redefined, the scope document should be updated and the change should be recorded in the decision log where appropriate.

The purpose of change control is not to create unnecessary bureaucracy. It is to keep the project coherent and traceable.

---

## 14. Summary

Antenna Version 1 is scoped as a focused, open-source Android application for browsing community-driven content, initially compatible with Reddit.

The project prioritises simplicity, efficiency, responsiveness, practicality, intuitiveness, transparency, and maintainability.

Version 1 should establish a solid foundation rather than attempt to deliver every possible feature immediately.