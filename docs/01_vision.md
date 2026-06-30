# Vision

**Project:** Antenna  
**Status:** Pre-Alpha / Planning  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## Vision statement

Antenna is an open-source Android application that provides a simple, efficient, responsive, practical, intuitive, and transparent interface for browsing community-driven discussion platforms.

Version 1 is designed for compatibility with Reddit while maintaining a clean, maintainable architecture and respecting the technical and policy constraints of the services it connects to.

Antenna exists to improve the user experience through thoughtful software design rather than unnecessary complexity. The project prioritises usability, performance, privacy, transparency, and maintainability so that users can focus on content and communities rather than on the application itself.

## Mission

To develop a modern, open-source Android application that demonstrates how community browsing software can be designed with clarity, efficiency, respect for the user, and long-term maintainability.

## Product thesis

Community browsing applications often become cluttered, engagement-driven, resource-heavy, or unnecessarily complex. Antenna takes the opposite position: the application should be fast, readable, predictable, transparent, and under the user's control.

Antenna should feel like a tool for browsing and reading, not a platform for extracting attention.

## Target outcome

Antenna should become a reliable Android application that:

- Opens quickly.
- Lets users browse communities and posts with minimal friction.
- Preserves a calm, readable interface.
- Supports anonymous browsing wherever technically possible.
- Allows local personalisation without requiring an account.
- Avoids application-owned advertising.
- Avoids telemetry and analytics by default.
- Explains limitations honestly.
- Remains maintainable for contributors.

## Objectives

Antenna's initial objectives are:

1. Build a fast and responsive native Android application.
2. Provide a clean and intuitive browsing experience.
3. Support anonymous browsing wherever technically and policy-wise possible.
4. Provide local favourites through **My Subs** without requiring platform account subscriptions.
5. Minimise unnecessary complexity in features, dependencies, UI, and architecture.
6. Maintain a transparent and privacy-conscious design.
7. Avoid application-owned advertising, analytics, and telemetry by default.
8. Produce documentation that is useful to users, maintainers, and contributors.
9. Establish an engineering foundation that can evolve without requiring premature over-abstraction.

## Design philosophy

Antenna is designed around the belief that software should serve the user rather than compete for the user's attention.

Features should exist because they improve usability, clarity, or reliability. Features should not be added because they are technically interesting, commonly found elsewhere, or likely to increase engagement metrics.

Where multiple solutions exist, preference should be given to the simplest solution that satisfies the project's documented objectives and constraints.

## Version 1 vision

Version 1 focuses on compatibility with Reddit and on establishing a stable, maintainable foundation. The goal is not to reproduce every Reddit feature or every feature of existing clients. The goal is to deliver a polished foundation that proves the core experience:

- Browse communities.
- Browse posts.
- Read comments.
- Manage local favourites.
- Search where supported.
- Configure basic local settings.
- Understand privacy and platform limitations.

## Long-term direction

Antenna may later support additional capabilities such as account login, voting, commenting, posting, offline reading, backup and restore, community grouping, custom feeds, tablet layouts, accessibility enhancements, advanced filtering, or additional platform compatibility.

These future capabilities must be evaluated against the project principles before being accepted. Future expansion should not compromise simplicity, transparency, privacy, or maintainability.

## Success criteria

Antenna will be considered successful when it provides users with:

- A clean and responsive interface.
- A browsing experience that feels natural and intuitive.
- Reliable performance on supported Android devices.
- Clear handling of loading, empty, error, restricted, and unsupported states.
- Transparent behaviour around local data, permissions, and platform limitations.
- A useful anonymous experience wherever supported.
- Confidence that the application is engineered with quality and maintainability as primary objectives.

## Anti-goals

Antenna should avoid:

- Engagement-driven design.
- Dark patterns.
- Unnecessary notification pressure.
- Advertising SDKs.
- Telemetry or analytics by default.
- Hidden data collection.
- Permission requests without clear user value.
- Unnecessary abstraction for hypothetical future platforms.
- Cluttered UI that competes with content.

## Project motto

**Simple. Efficient. Responsive. Practical. Intuitive.**
