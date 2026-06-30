# Requirements Traceability Matrix

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This matrix traces Antenna's principles, objectives, requirements, UI/UX decisions, architecture, and tests.

Traceability helps prevent scope drift and makes it easier to verify that implementation matches project intent.

---

## 2. Principle to requirement mapping

| Principle | Supporting requirements / documents |
| --- | --- |
| Simple | Scope exclusions, FR-049 to FR-053, ADR-008, UI primary navigation. |
| Efficient | NFR performance/resource requirements, architecture data flow, caching guidance. |
| Responsive | FR-014, NFR performance requirements, UI loading states. |
| Practical | Product requirements, Version 1 scope, roadmap phases. |
| Intuitive | UI/UX specification, Home/Search/Explore/My Subs/Settings model. |
| Transparent | Privacy settings, platform limitation messages, no telemetry/analytics by default. |
| Maintainable | Modular architecture, decision log, contribution standards. |
| Consistent | Glossary, shared screen states, shared UI components. |

---

## 3. Objective to feature mapping

| Objective | Feature area |
| --- | --- |
| Clean Android browsing experience | Home, community feed, post detail, comments. |
| Anonymous browsing where possible | Community browsing, post reading, comments, search, local favourites. |
| Local favourites without account | My Subs, Home feed. |
| Responsive interface | Feed rendering, loading states, caching. |
| Privacy-first defaults | No ads, no telemetry, no analytics, local data controls. |
| Maintainable codebase | Modules, repositories, tests, ADRs. |
| Future foundation | Roadmap, architecture, backlog, open questions. |

---

## 4. Feature to requirement mapping

| Feature | Functional requirements | Non-functional requirements |
| --- | --- | --- |
| App launch | FR-001 to FR-003 | NFR-001, NFR-054 |
| Home | FR-004 to FR-006 | NFR-001 to NFR-006 |
| Community browsing | FR-007 to FR-011 | NFR-012 to NFR-017 |
| Feed browsing | FR-012 to FR-017 | NFR-001 to NFR-011 |
| Post viewing | FR-018 to FR-025 | NFR-012 to NFR-017 |
| Comment viewing | FR-026 to FR-032 | NFR-006, NFR-030 to NFR-035 |
| Search | FR-033 to FR-036 | NFR-012 to NFR-017 |
| My Subs | FR-037 to FR-043 | NFR-022, NFR-036 to NFR-041 |
| NSFW visibility | FR-044 to FR-048 | NFR-023, NFR-046 to NFR-049 |
| Settings | FR-049 to FR-053 | NFR-030 to NFR-035 |
| Privacy controls | FR-054 to FR-058 | NFR-018 to NFR-024 |
| Error handling | FR-059 to FR-063 | NFR-012 to NFR-017 |
| Account separation | FR-064 to FR-065 | NFR-046 to NFR-049 |
| Documentation | FR-066 to FR-068 | NFR-040, NFR-041, NFR-054 to NFR-057 |

---

## 5. Architecture mapping

| Architecture area | Requirement coverage |
| --- | --- |
| `app` | Launch, navigation, dependency wiring. |
| `core-ui` | Shared UI, theme, accessibility, consistency. |
| `core-model` | Community, post, comment, media, settings models. |
| `core-data` | Repositories, data mapping, cache coordination. |
| `core-network` | Reddit-compatible access, platform errors. |
| `core-database` | Local favourites, settings, cache. |
| `feature-home` | Home feed and empty state. |
| `feature-search` | Search flows and results. |
| `feature-explore` | Discovery flows. |
| `feature-my-subs` | Local favourites management. |
| `feature-settings` | Appearance, content, privacy, account, FAQ, About. |
| `feature-post-detail` | Post detail and comments. |

---

## 6. Test mapping

| Test area | Verifies |
| --- | --- |
| First launch manual/UI test | FR-001 to FR-003. |
| Navigation UI test | Primary navigation model. |
| Community feed test | FR-007 to FR-017. |
| Post detail test | FR-018 to FR-025. |
| Comment test | FR-026 to FR-032. |
| Search test | FR-033 to FR-036. |
| Local favourites unit/UI tests | FR-037 to FR-043. |
| NSFW setting test | FR-044 to FR-048. |
| Privacy release checklist | FR-054 to FR-058, NFR-018 to NFR-024. |
| Error state tests | FR-059 to FR-063. |
| Accessibility checklist | NFR-030 to NFR-035. |
| Documentation review | FR-066 to FR-068. |

---

## 7. Decision mapping

| Decision | Related area |
| --- | --- |
| ADR-001 Project Name | Product identity, disclaimer. |
| ADR-002 Native Android Application | Technical scope. |
| ADR-003 Version 1 Compatibility Target | Reddit compatibility, platform constraints. |
| ADR-004 Local Favourites | My Subs, anonymous personalisation. |
| ADR-005 No Advertising | Privacy posture. |
| ADR-006 Privacy-First Defaults | Telemetry, analytics, permissions. |
| ADR-007 Documentation-First Setup | Project governance. |
| ADR-008 Avoid Over-Engineering Version 1 | Scope discipline. |
| ADR-009 Primary Navigation Model | UI/UX structure. |
| ADR-010 Modular Android Architecture Direction | Architecture. |
| ADR-011 Local NSFW Visibility Setting | Content settings. |
| ADR-012 Dependency Minimalism | Maintainability and efficiency. |

---

## 8. Maintenance rule

When a requirement changes, review:

- Scope.
- Functional requirements.
- Non-functional requirements.
- UI/UX.
- Architecture.
- Tests.
- Roadmap.
- Decision log.
- User-facing documentation.

---

## 9. Summary

Traceability keeps Antenna coherent. It connects why the project exists to what the app must do, how it should be built, and how quality should be verified.
