# Testing Strategy

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document defines Antenna's testing strategy for pre-alpha through Version 1.

The goal is practical confidence in core browsing flows, privacy guarantees, UI behaviour, error handling, and maintainability.

---

## 2. Testing principles

Testing should be:

- Focused on high-value user journeys.
- Practical for an early open-source project.
- Automated where it protects core logic.
- Manual where human judgement is required.
- Updated when requirements change.

---

## 3. Test levels

| Level | Purpose | Examples |
| --- | --- | --- |
| Unit tests | Validate isolated logic. | Name normalisation, settings, favourite sorting, error mapping. |
| Repository tests | Validate data coordination. | Local favourites, cache behaviour, network fallback. |
| UI tests | Validate Compose screen behaviour. | Navigation, empty states, settings toggles. |
| Integration tests | Validate flow across layers. | Search → community → post detail. |
| Manual QA | Validate real user experience. | Scroll smoothness, readability, media, accessibility. |
| Release checks | Validate readiness. | Build, lint, tests, docs, privacy review. |

---

## 4. Critical flows

The following flows are release-critical:

1. First launch.
2. Navigate Home, Search, Explore, My Subs, Settings.
3. Open community.
4. View feed.
5. Open post detail.
6. Read comments.
7. Add local favourite.
8. Remove local favourite.
9. Configure theme.
10. Configure NSFW visibility.
11. Handle network failure.
12. Handle restricted content.
13. Handle unsupported content.

---

## 5. Unit test candidates

Unit tests should cover:

- Community name normalisation.
- Display name generation.
- Duplicate favourite prevention.
- Alphabetical favourite sorting.
- Theme setting persistence rules.
- NSFW age confirmation rules.
- Sort option mapping.
- Content filter mapping.
- Network error to app error mapping.
- Platform post type to Antenna post type mapping.
- Comment tree flattening or nesting.
- Cache key generation where implemented.

---

## 6. UI test candidates

UI tests should cover:

- Primary navigation items render.
- Home empty state appears with no favourites.
- My Subs displays saved communities.
- Add favourite action updates UI.
- Remove favourite action updates UI.
- Settings sections render.
- NSFW setting requires age confirmation.
- Error state displays retry action.
- Unsupported content displays message.

---

## 7. Manual QA scripts

### First launch

- Install clean build.
- Launch app.
- Confirm no account login is required.
- Confirm primary navigation is visible.
- Confirm Settings is reachable.

### Local favourites

- Add a community.
- Confirm it appears in My Subs.
- Restart app.
- Confirm it persists.
- Remove it.
- Confirm it disappears.

### Post and comments

- Open a community.
- Open a post.
- Confirm content and metadata appear.
- Confirm comments load.
- Collapse and expand comments.
- Return to feed.

### Error states

- Simulate network failure.
- Open unavailable community.
- Open unsupported content where possible.
- Confirm all states are clear and non-crashing.

---

## 8. Privacy test checklist

Before release:

- [ ] Confirm no advertising SDK is present.
- [ ] Confirm no analytics SDK is present.
- [ ] Confirm no telemetry is emitted by default.
- [ ] Confirm permissions are necessary.
- [ ] Confirm local favourites remain local.
- [ ] Confirm logs do not expose sensitive data.
- [ ] Confirm NSFW content is hidden/restricted by default.

---

## 9. Defect severity

| Severity | Meaning | Release impact |
| --- | --- | --- |
| P0 | Crash, data loss, privacy breach, or core browsing unusable. | Blocks release. |
| P1 | Major feature broken or severe UX issue. | Usually blocks release. |
| P2 | Noticeable problem with workaround. | May ship if documented. |
| P3 | Minor polish issue. | Does not block release. |

---

## 10. Quality gate

A release candidate should not proceed unless:

- Build passes.
- Critical manual flows pass.
- No P0 defects remain.
- Privacy checklist passes.
- Accessibility spot checks pass.
- Documentation and changelog are updated.

---

## 11. Summary

Antenna's testing strategy should protect the behaviours that matter most: browsing, reading, local favourites, settings, privacy, error handling, and accessibility.
