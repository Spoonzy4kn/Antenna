# Scope of Works

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## 1. Purpose

This document defines the initial scope of works for Antenna.

It describes what the project will deliver, what is currently excluded, and the boundaries that guide Version 1 development. It does not define every class, function, API call, database table, or implementation detail. Those details are covered by architecture, implementation, and decision documents.

## 2. Project summary

Antenna is an open-source Android application designed to provide a simple, efficient, responsive, practical, intuitive, and transparent interface for browsing community-driven discussion platforms.

Version 1 is intended to be compatible with Reddit.

The project aims to provide a cleaner and more user-focused browsing experience while remaining maintainable, transparent, privacy-conscious, and respectful of the technical and policy constraints of the platform it connects to.

## 3. Objectives

The primary objectives of Antenna are to:

- Provide a clean Android browsing experience for community-driven content.
- Support anonymous browsing wherever technically possible.
- Allow users to locally favourite communities without requiring an account.
- Provide a responsive and intuitive user interface.
- Avoid advertising, telemetry, and analytics by default.
- Build a maintainable open-source codebase.
- Establish a strong foundation for future development.
- Maintain professional documentation that supports implementation and contribution.

## 4. Version 1 scope

Version 1 will focus on establishing a stable, usable, and maintainable application foundation.

The initial release does not need to match every feature of existing commercial applications. The priority is to deliver a working application that demonstrates the core user experience and architectural direction.

Version 1 shall include:

- Android application foundation.
- Native Android user interface.
- Clean primary navigation.
- Community browsing.
- Post browsing.
- Comment viewing.
- Local favourites through My Subs.
- Basic search where supported.
- Local settings.
- Dark mode.
- NSFW visibility setting where permitted.
- Clear loading, empty, error, restricted, and unsupported states.
- No advertising within the application.
- No telemetry or analytics by default.
- Basic user documentation.
- Developer documentation sufficient to build and understand the application.

## 5. Functional scope

### 5.1 Community browsing

The application shall allow users to browse communities available through the connected platform.

Users should be able to:

- Open a community directly.
- Search for communities where supported.
- View a list of posts from a community.
- Sort or filter posts where supported.
- Return to previously viewed communities where practical.
- Understand when a community is unavailable, restricted, private, unsupported, or inaccessible due to platform limitations.

### 5.2 Post browsing

The application shall allow users to view posts.

Supported or intended post types include:

- Text posts.
- Link posts.
- Image posts.
- Gallery posts where supported.
- Video posts where supported.
- Metadata such as title, author, score, community, comment count, and posted time where available.

The application should present posts in a clean and readable format.

### 5.3 Comment viewing

The application shall allow users to read comments on posts.

The comment interface should support:

- Nested comment threads.
- Collapse and expand behaviour.
- Clear visual hierarchy.
- Smooth scrolling.
- Readable formatting.
- Graceful handling of deleted, removed, restricted, or unavailable comments.

Commenting is not required for anonymous Version 1 usage.

### 5.4 Local favourites / My Subs

The application shall allow users to favourite communities locally.

Local favourites shall:

- Not require an online account.
- Be stored on the device.
- Be editable by the user.
- Be used to build a personalised local feed where supported.
- Remain separate from platform-managed subscriptions.
- Be clearly explained as local application data.

Future versions may support backup, restore, grouping, import, export, or optional synchronisation of local favourites.

### 5.5 Search

The application shall provide basic search functionality where supported.

Search may include:

- Searching for communities.
- Searching for posts.
- Searching users where supported and in scope.
- Opening a result directly.
- Sorting and filtering search results where supported.

Search capability will depend on the connected platform and selected access method.

### 5.6 Anonymous use

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

### 5.7 Account-based features

Account-based features are not mandatory for the initial Version 1 foundation.

Where supported in future versions, account login may enable:

- Voting.
- Commenting.
- Posting.
- Reporting.
- Platform-managed subscriptions.
- Messages.
- Notifications.
- Account-specific preferences.

These features shall be implemented only if they can be supported properly and within applicable platform constraints.

### 5.8 NSFW content

The application shall include a local NSFW visibility setting.

The intended behaviour is:

- SFW content is shown by default.
- NSFW content is hidden or restricted by default.
- A user may enable NSFW visibility after confirming they are over 18.
- The application shall respect platform restrictions relating to NSFW content.
- The local setting shall not override restrictions imposed by the connected platform.

### 5.9 Settings

The application shall include a basic settings area.

Initial settings may include:

- Theme mode.
- NSFW visibility.
- Local favourites management.
- Cache controls.
- Privacy information.
- Account information.
- FAQ.
- About.
- Application version information.

Settings should be simple and clearly explained.

## 6. Non-functional scope

Antenna shall be designed to meet non-functional goals in the following areas:

- Performance.
- Reliability.
- Privacy.
- Security.
- Accessibility.
- Maintainability.
- Transparency.
- Testability.
- Compatibility.
- Resource efficiency.

Detailed non-functional requirements are defined in `05_non_functional_requirements.md`.

## 7. Technical scope

Version 1 is expected to use:

- Native Android development.
- Kotlin.
- Jetpack Compose.
- Gradle.
- Local storage for settings and favourites.
- Modular project structure.
- Networking layer compatible with the selected platform access method.
- Clear separation between UI, application logic, data, network, local storage, and platform services.

Specific architecture decisions are documented separately.

## 8. External constraints

Antenna Version 1 is intended to be compatible with Reddit.

The application shall use supported access methods and shall not be designed around bypassing technical or policy restrictions.

Some features may depend on:

- Platform API availability.
- Platform terms of service.
- Authentication requirements.
- Rate limits.
- Content restrictions.
- Media access limitations.
- NSFW access limitations.
- Network availability.
- Regional or account-specific restrictions.

If a desired feature cannot be implemented within these constraints, it shall be documented and deferred or removed from scope.

## 9. Out of scope for Version 1

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
- Application-owned advertising.
- Telemetry or analytics by default.
- Push notification system.
- Multi-account support.
- Offline-first architecture.
- Custom recommendation system.

These items may be reconsidered in later versions if they align with the project principles.

## 10. Future considerations

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
- Optional diagnostic logging controlled by the user.

Future features must be evaluated against the project principles before being added to scope.

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
- Basic developer documentation.
- Decision log.
- Testing strategy.
- Release and versioning guidance.

## 12. Definition of Done for Version 1 foundation

The Version 1 foundation will be considered complete when:

- The application can be built from source.
- The application launches successfully on a supported Android device.
- Users can browse compatible community content where supported.
- Users can open communities.
- Users can open posts.
- Users can read comments.
- Users can manage local favourites.
- Basic settings are available.
- Dark mode is available.
- NSFW visibility handling exists where permitted.
- The application contains no advertising of its own.
- The application includes no telemetry or analytics by default.
- The application handles core failure states gracefully.
- The repository includes sufficient documentation for future development.
- The release can be validated through documented manual and automated checks.

## 13. Change control

Changes to scope should be deliberate and traceable.

If a significant feature is added, removed, or redefined:

1. Update this scope document.
2. Update functional and non-functional requirements.
3. Update UI/UX documentation if user-facing behaviour changes.
4. Update architecture documentation if technical structure changes.
5. Update the decision log if the change is significant.
6. Update the traceability matrix.
7. Update the roadmap and implementation backlog.

The purpose of change control is not bureaucracy. It is to keep the project coherent and traceable.

## 14. Summary

Antenna Version 1 is scoped as a focused, open-source Android application for browsing community-driven content, initially compatible with Reddit.

The project prioritises simplicity, efficiency, responsiveness, practicality, intuitiveness, transparency, privacy, and maintainability.

Version 1 should establish a solid foundation rather than attempt to deliver every possible feature immediately.
