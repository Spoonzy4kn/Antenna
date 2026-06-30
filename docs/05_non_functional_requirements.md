# Non-Functional Requirements

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## 1. Purpose

This document defines Antenna's non-functional requirements.

Non-functional requirements describe how the application should behave, how well it should perform, how it should protect user interests, and how it should be maintained. These requirements are as important as feature requirements because they define quality, reliability, trust, and maintainability.

## 2. Requirement language

- **Shall:** mandatory requirement.
- **Should:** expected requirement that may be adjusted with documented justification.
- **May:** optional or future-consideration requirement.
- **Must not:** explicit prohibition.

---

## 3. Performance

### NFR-001: Startup performance

The application should launch quickly on supported Android devices.

Implementation should avoid unnecessary blocking work during startup.

### NFR-002: Smooth scrolling

Feed, community, post, and comment screens shall remain smooth under normal operating conditions.

Large comment threads and media-rich feeds should be handled without avoidable UI jank.

### NFR-003: Main-thread safety

Network requests, disk operations, JSON parsing, image loading, and database work shall not block the main UI thread.

### NFR-004: Efficient media loading

Images, previews, galleries, and videos should be loaded efficiently using appropriate caching and lifecycle-aware behaviour.

### NFR-005: Pagination efficiency

The application should avoid loading excessive content at once. Feeds and comment lists should load incrementally where supported.

### NFR-006: Battery efficiency

The application should avoid unnecessary background work, polling, wake locks, and repeated network calls.

### NFR-007: Memory efficiency

The application should avoid holding unnecessary large objects, media files, or response payloads in memory.

---

## 4. Reliability

### NFR-008: Graceful failure

The application shall handle common failure conditions gracefully.

Common failures include:

- Network unavailable.
- Slow network.
- Empty responses.
- Invalid community names.
- Restricted communities.
- Deleted content.
- Removed comments.
- Unsupported content types.
- Rate limits.
- Unexpected data formats.

### NFR-009: Recoverable UI states

Major screens shall define loading, loaded, empty, error, offline, restricted, and unsupported states.

### NFR-010: User-facing error clarity

Errors shall be translated into clear user-facing language. Raw technical errors should not normally be shown to users.

### NFR-011: Retry where practical

Recoverable errors should offer retry where practical.

### NFR-012: Data consistency

Local favourites, settings, and cache state shall remain consistent across application restarts.

### NFR-013: Duplicate prevention

Local favourite storage shall prevent duplicate community entries.

---

## 5. Privacy

### NFR-014: No telemetry by default

Antenna shall not include telemetry by default.

### NFR-015: No analytics by default

Antenna shall not include analytics by default.

### NFR-016: No advertising by application

Antenna shall not include application-owned advertising or advertising SDKs.

### NFR-017: Minimal local data

Antenna shall store only local data that serves a clear user benefit.

Initial local data may include:

- Local favourites.
- Theme setting.
- NSFW visibility setting.
- Basic application preferences.
- Cache where implemented.
- Recently viewed data where implemented and explained.

### NFR-018: Local-first preferences

User preferences should be stored locally where practical.

### NFR-019: Clear privacy information

The application should explain what data it stores, what permissions it requests, and whether telemetry or analytics are used.

### NFR-020: Optional diagnostics rule

If diagnostics are considered in the future, they must be clearly documented, justified, optional, and opt-in.

---

## 6. Security

### NFR-021: Permission minimisation

The application shall request only permissions required for implemented functionality.

### NFR-022: Safe storage

Sensitive data, if introduced in future versions, shall be stored using appropriate Android security mechanisms.

### NFR-023: Account token protection

If account login is implemented later, authentication tokens shall not be stored in plain text.

### NFR-024: Dependency safety

Dependencies should be added deliberately and reviewed for maintenance status, privacy implications, size, and security risk.

### NFR-025: External link handling

External links should be opened safely and clearly so users understand when they are leaving Antenna.

### NFR-026: Platform restriction compliance

Antenna shall not be designed to bypass technical or policy restrictions of connected platforms.

---

## 7. Accessibility

### NFR-027: Screen reader support

Interactive UI elements should have meaningful labels for accessibility services.

### NFR-028: Text scaling

The application should support Android text scaling without breaking core layouts.

### NFR-029: Colour contrast

Text, icons, and interactive states should maintain sufficient contrast in light and dark themes.

### NFR-030: Touch target size

Primary interactive controls should use accessible touch target sizes.

### NFR-031: Motion sensitivity

The application should avoid unnecessary motion and respect reduced-motion expectations where practical.

### NFR-032: Content readability

Post and comment reading should remain clear with long text, nested comments, links, quotes, and code blocks.

---

## 8. Maintainability

### NFR-033: Modular codebase

The codebase should use clear module boundaries.

Initial module direction:

- `app`
- `core-ui`
- `core-model`
- `core-data`
- `core-network`
- `core-database`
- `feature-home`
- `feature-search`
- `feature-explore`
- `feature-my-subs`
- `feature-settings`
- `feature-post-detail`

### NFR-034: Separation of concerns

UI screens shall not directly perform network or database operations.

### NFR-035: Testability

Application logic, repository behaviour, local storage behaviour, and network mapping should be testable.

### NFR-036: Documentation maintenance

Documentation shall evolve alongside code and requirements.

### NFR-037: Decision traceability

Significant decisions shall be recorded in the decision log.

### NFR-038: Consistent terminology

The project shall use consistent terminology across code, UI, documentation, and issues.

---

## 9. Compatibility

### NFR-039: Android-first compatibility

Version 1 shall target Android only.

### NFR-040: Kotlin-first implementation

Version 1 shall use Kotlin as the primary language.

### NFR-041: Compose-first UI

Version 1 shall use Jetpack Compose as the intended UI framework.

### NFR-042: Reddit compatibility target

Version 1 shall target compatibility with Reddit using supported access methods.

### NFR-043: No multi-provider plugin system in Version 1

Antenna shall not build a generic multi-provider plugin architecture in Version 1.

---

## 10. Transparency

### NFR-044: Account requirement messaging

If a feature requires an account, the application should clearly explain that requirement.

### NFR-045: Platform limitation messaging

If content cannot be displayed due to platform limitations, the application should communicate this clearly where practical.

### NFR-046: NSFW limitation messaging

The local NSFW visibility setting shall not imply that Antenna can override platform restrictions.

### NFR-047: Local favourites clarity

The application shall explain that My Subs are local favourites and not platform-managed subscriptions.

---

## 11. Quality and testing

### NFR-048: Critical-flow testing

The project should test critical flows before release.

Critical flows include:

- Launch app.
- Open Home.
- Search community.
- Add local favourite.
- Remove local favourite.
- Open community.
- Open post.
- Read comments.
- Change theme.
- Change NSFW visibility.
- Clear local data where implemented.

### NFR-049: Regression testing

Bugs fixed in core flows should result in regression tests where practical.

### NFR-050: Manual test checklist

Before tagged releases, maintainers should complete a documented manual test checklist.

### NFR-051: Release readiness

A release shall not be tagged as stable unless build, test, documentation, privacy, and release notes have been reviewed.

---

## 12. Observability without telemetry

### NFR-052: Local debug logging

During development, the application may use local debug logging for developers.

### NFR-053: User privacy boundary

Local debug logging shall not become telemetry or analytics without an explicit opt-in design and documented decision.

### NFR-054: Error reporting future rule

If user-submitted error reports are added later, the user must control what information is shared.

---

## 13. Summary

Antenna's non-functional requirements reinforce the project principles: simplicity, efficiency, responsiveness, practicality, intuitiveness, transparency, maintainability, and consistency.

Version 1 should be judged not only by whether features exist, but by whether they are reliable, respectful, understandable, accessible, and maintainable.
